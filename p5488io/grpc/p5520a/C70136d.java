package p5488io.grpc.p5520a;

import com.google.common.base.C58831av;
import com.google.p4651h.C61648b;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70249bt;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70356e;
import p5488io.grpc.C70700ee;
import p5488io.grpc.C70722f;
import p5488io.grpc.C70769g;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5525e.C70452dn;
import p5488io.grpc.p5525e.C70692w;

/* renamed from: io.grpc.a.d */
/* compiled from: PG */
public final class C70136d extends C70769g implements C70249bt {

    /* renamed from: a */
    public static final Logger f186957a;

    /* renamed from: b */
    public static final C70134b f186958b;

    /* renamed from: f */
    private static final Class f186959f;

    /* renamed from: g */
    private static final Class f186960g;

    /* renamed from: c */
    final C61648b f186961c;

    /* renamed from: d */
    public C70334de f186962d;

    /* renamed from: e */
    public Map f186963e;

    /* renamed from: h */
    private final boolean f186964h;

    /* renamed from: i */
    private Boolean f186965i;

    static {
        C70134b bVar;
        Class<? extends U> cls;
        Class<C70136d> cls2 = C70136d.class;
        f186957a = Logger.getLogger(cls2.getName());
        ClassLoader classLoader = cls2.getClassLoader();
        Class<?> cls3 = null;
        try {
            try {
                bVar = new C70134b(Class.forName("com.google.auth.oauth2.ServiceAccountCredentials", false, classLoader), classLoader);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                f186957a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", e);
            }
        } catch (ClassNotFoundException unused) {
            bVar = null;
            f186958b = bVar;
            cls = Class.forName("com.google.h.a.c").asSubclass(C61648b.class);
            f186959f = cls;
            cls3 = Class.forName("com.google.auth.appengine.AppEngineCredentials");
            f186960g = cls3;
        }
        f186958b = bVar;
        try {
            cls = Class.forName("com.google.h.a.c").asSubclass(C61648b.class);
        } catch (ClassNotFoundException e2) {
            f186957a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", e2);
            cls = null;
        }
        f186959f = cls;
        try {
            cls3 = Class.forName("com.google.auth.appengine.AppEngineCredentials");
        } catch (ClassNotFoundException e3) {
            f186957a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadAppEngineCredentials", "AppEngineCredentials not available in classloader", e3);
        }
        f186960g = cls3;
    }

    public C70136d(C61648b bVar, C70134b bVar2) {
        Class cls = f186959f;
        boolean isInstance = cls != null ? cls.isInstance(bVar) : false;
        if (bVar2 != null && bVar2.f186950a.isInstance(bVar)) {
            try {
                C61648b bVar3 = (C61648b) bVar2.f186950a.cast(bVar);
                try {
                    if (((Collection) bVar2.f186953d.invoke(bVar3, new Object[0])).size() != 0) {
                        bVar = bVar3;
                    } else {
                        Object invoke = bVar2.f186951b.invoke((Object) null, new Object[0]);
                        for (C70135c cVar : bVar2.f186954e) {
                            cVar.f186956b.invoke(invoke, new Object[]{cVar.f186955a.invoke(bVar3, new Object[0])});
                        }
                        bVar = (C61648b) bVar2.f186952c.invoke(invoke, new Object[0]);
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e = e;
                    bVar = bVar3;
                    f186957a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", e);
                    this.f186964h = isInstance;
                    this.f186961c = bVar;
                }
            } catch (IllegalAccessException | InvocationTargetException e2) {
                e = e2;
                f186957a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", e);
                this.f186964h = isInstance;
                this.f186961c = bVar;
            }
        }
        this.f186964h = isInstance;
        this.f186961c = bVar;
    }

    /* renamed from: c */
    private static URI m102110c(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.f186910h.withDescription("Unable to construct service URI after removing port").mo61678e(e).asException();
        }
    }

    /* renamed from: d */
    private static URI m102111d(String str, C70338di diVar) {
        try {
            URI uri = new URI("https", str, "/".concat(String.valueOf(diVar.f187498c)), (String) null, (String) null);
            return uri.getPort() == 443 ? m102110c(uri) : uri;
        } catch (URISyntaxException e) {
            throw Status.f186910h.withDescription("Unable to construct service URI for auth").mo61678e(e).asException();
        }
    }

    /* renamed from: a */
    public final void mo61690a(C70722f fVar, Executor executor, C70356e eVar) {
        C70692w wVar = (C70692w) fVar;
        C70256c o = wVar.f188430b.f188431a.mo61932o();
        C70700ee eeVar = (C70700ee) C58831av.m90830c((C70700ee) o.f187256b.get(C70452dn.f187762a), C70700ee.NONE);
        if (!this.f186964h || eeVar == C70700ee.PRIVACY_AND_INTEGRITY) {
            try {
                m102111d((String) C58831av.m90830c((Object) null, wVar.f188430b.f188432b), ((C70692w) fVar).f188429a);
                this.f186961c.mo58163b(executor, new C70133a(this, eVar));
            } catch (StatusException e) {
                eVar.mo62072a(e.f186943a);
            }
        } else {
            eVar.mo62072a(Status.f186910h.withDescription("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(eeVar.toString())));
        }
    }

    /* renamed from: b */
    public final boolean mo61691b() {
        if (this.f186965i == null) {
            Class cls = f186960g;
            if (cls == null) {
                this.f186965i = Boolean.FALSE;
            } else {
                this.f186965i = Boolean.valueOf(cls.isInstance(this.f186961c));
            }
        }
        return this.f186965i.booleanValue();
    }
}
