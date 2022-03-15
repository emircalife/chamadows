import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function NavBar(){
    return(
        <header>
            <nav className="container">
                <div className="chamadows-nav-content">
                    <h1>Chamadows</h1>
                    <a href="https://github.com/emircalife" target="_blank" rel="noreferrer">
                        <div className="chamadows-contact-container">
                            <GithubIcon />
                            <p className="chamadows-contact-link">/emircalife</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default NavBar;