package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70339dj;
import p5488io.grpc.C70342dm;
import p5488io.grpc.C70344do;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70699ed;
import p5488io.grpc.C70766ff;

/* renamed from: io.grpc.e.dc */
/* compiled from: PG */
public final class C70441dc extends C70345dp {

    /* renamed from: a */
    public static final Logger f187722a;

    /* renamed from: b */
    public static final Set f187723b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));

    /* renamed from: c */
    static final boolean f187724c;

    /* renamed from: d */
    static final boolean f187725d;

    /* renamed from: e */
    protected static final boolean f187726e;

    /* renamed from: f */
    public static final C70440db f187727f;

    /* renamed from: s */
    private static final String f187728s;

    /* renamed from: t */
    private static final String f187729t;

    /* renamed from: u */
    private static final String f187730u;

    /* renamed from: v */
    private static String f187731v;

    /* renamed from: A */
    private final boolean f187732A;

    /* renamed from: B */
    private C70342dm f187733B;

    /* renamed from: g */
    final C70699ed f187734g;

    /* renamed from: h */
    public final Random f187735h = new Random();

    /* renamed from: i */
    protected volatile C70433cv f187736i = C70435cx.f187710a;

    /* renamed from: j */
    public final AtomicReference f187737j = new AtomicReference();

    /* renamed from: k */
    public final String f187738k;

    /* renamed from: l */
    public final int f187739l;

    /* renamed from: m */
    public final long f187740m;

    /* renamed from: n */
    public final C70766ff f187741n;

    /* renamed from: o */
    public final C58872ci f187742o;

    /* renamed from: p */
    protected boolean f187743p;

    /* renamed from: q */
    public final C70344do f187744q;

    /* renamed from: r */
    public boolean f187745r;

    /* renamed from: w */
    private final String f187746w;

    /* renamed from: x */
    private final C70667lm f187747x;

    /* renamed from: y */
    private boolean f187748y;

    /* renamed from: z */
    private Executor f187749z;

    static {
        Class<C70441dc> cls = C70441dc.class;
        Logger logger = Logger.getLogger(cls.getName());
        f187722a = logger;
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f187728s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f187729t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f187730u = property3;
        f187724c = Boolean.parseBoolean(property);
        f187725d = Boolean.parseBoolean(property2);
        f187726e = Boolean.parseBoolean(property3);
        C70440db dbVar = null;
        try {
            try {
                try {
                    C70440db dbVar2 = (C70440db) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, cls.getClassLoader()).asSubclass(C70440db.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (dbVar2.mo62160b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", dbVar2.mo62160b());
                    } else {
                        dbVar = dbVar2;
                    }
                } catch (Exception e) {
                    f187722a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", e);
                }
            } catch (Exception e2) {
                f187722a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", e2);
            }
        } catch (ClassNotFoundException e3) {
            f187722a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", e3);
        } catch (ClassCastException e4) {
            f187722a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", e4);
        }
        f187727f = dbVar;
    }

    protected C70441dc(String str, C70339dj djVar, C70667lm lmVar, C58872ci ciVar, boolean z) {
        String str2 = str;
        C70339dj djVar2 = djVar;
        C58838bb.m90866a(djVar2, "args");
        this.f187747x = lmVar;
        C58838bb.m90866a(str2, "name");
        URI create = URI.create("//".concat(str2));
        boolean z2 = true;
        C58838bb.m90873h(create.getHost() != null, "Invalid DNS name: %s", str2);
        String authority = create.getAuthority();
        C58838bb.m90867b(authority, "nameUri (%s) doesn't have an authority", create);
        this.f187746w = authority;
        this.f187738k = create.getHost();
        if (create.getPort() == -1) {
            this.f187739l = djVar2.f187503a;
        } else {
            this.f187739l = create.getPort();
        }
        this.f187734g = djVar2.f187504b;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f187722a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.f187740m = j;
        this.f187742o = ciVar;
        this.f187741n = djVar2.f187505c;
        Executor executor = djVar2.f187507e;
        this.f187749z = executor;
        this.f187732A = executor != null ? false : z2;
        this.f187744q = djVar2.f187506d;
    }

    /* renamed from: b */
    public static String m102807b() {
        if (f187731v == null) {
            try {
                f187731v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f187731v;
    }

    /* renamed from: f */
    private final void m102808f() {
        if (!this.f187745r && !this.f187748y) {
            if (this.f187743p) {
                long j = this.f187740m;
                if (j != 0 && (j <= 0 || this.f187742o.mo56158a(TimeUnit.NANOSECONDS) <= this.f187740m)) {
                    return;
                }
            }
            this.f187745r = true;
            this.f187749z.execute(new C70437cz(this, this.f187733B));
        }
    }

    /* renamed from: a */
    public final String mo57969a() {
        return this.f187746w;
    }

    /* renamed from: c */
    public final void mo57971c() {
        if (!this.f187748y) {
            this.f187748y = true;
            Executor executor = this.f187749z;
            if (executor != null && this.f187732A) {
                C70668ln.f188396a.mo62411b(this.f187747x, executor);
                this.f187749z = null;
            }
        }
    }

    /* renamed from: d */
    public final void mo57972d(C70342dm dmVar) {
        C58838bb.m90884s(this.f187733B == null, "already started");
        if (this.f187732A) {
            this.f187749z = (Executor) C70668ln.f188396a.mo62410a(this.f187747x);
        }
        this.f187733B = dmVar;
        m102808f();
    }

    /* renamed from: e */
    public final void mo62055e() {
        C58838bb.m90884s(this.f187733B != null, "not started");
        m102808f();
    }
}
