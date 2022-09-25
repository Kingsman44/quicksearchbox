package p5488io.grpc.p5527g;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p5488io.grpc.p5527g.p5528a.C70795h;
import p5488io.grpc.p5527g.p5528a.C70803p;
import p5488io.grpc.p5527g.p5528a.C70806s;

/* renamed from: io.grpc.g.ac */
/* compiled from: PG */
final class C70809ac extends C70810ad {

    /* renamed from: d */
    private static final C70795h f188844d = new C70795h((Class) null, "setUseSessionTickets", Boolean.TYPE);

    /* renamed from: e */
    private static final C70795h f188845e = new C70795h((Class) null, "setHostname", String.class);

    /* renamed from: f */
    private static final C70795h f188846f;

    /* renamed from: g */
    private static final C70795h f188847g;

    /* renamed from: h */
    private static final C70795h f188848h;

    /* renamed from: i */
    private static final C70795h f188849i;

    /* renamed from: j */
    private static final Method f188850j;

    /* renamed from: k */
    private static final Method f188851k;

    /* renamed from: l */
    private static final Method f188852l;

    /* renamed from: m */
    private static final Method f188853m;

    /* renamed from: n */
    private static final Method f188854n;

    /* renamed from: o */
    private static final Method f188855o;

    /* renamed from: p */
    private static final Constructor f188856p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        ClassNotFoundException classNotFoundException;
        NoSuchMethodException noSuchMethodException;
        Method method7;
        Method method8;
        ClassNotFoundException classNotFoundException2;
        Method method9;
        ClassNotFoundException e;
        Method method10;
        NoSuchMethodException noSuchMethodException2;
        NoSuchMethodException e2;
        Constructor<?> constructor = null;
        Class<byte[]> cls = byte[].class;
        f188846f = new C70795h(cls, "getAlpnSelectedProtocol", new Class[0]);
        f188847g = new C70795h((Class) null, "setAlpnProtocols", cls);
        f188848h = new C70795h(cls, "getNpnSelectedProtocol", new Class[0]);
        f188849i = new C70795h((Class) null, "setNpnProtocols", cls);
        Class<SSLParameters> cls2 = SSLParameters.class;
        try {
            method4 = cls2.getMethod("setApplicationProtocols", new Class[]{String[].class});
            try {
                method5 = cls2.getMethod("getApplicationProtocols", new Class[0]);
                try {
                    method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    method9 = null;
                    method10 = method9;
                    classNotFoundException2 = e;
                    C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", classNotFoundException2);
                    method3 = null;
                    method2 = method8;
                    method = method7;
                    f188852l = method4;
                    f188853m = method5;
                    f188854n = method2;
                    f188850j = method;
                    f188851k = method3;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                    } catch (ClassNotFoundException e4) {
                        classNotFoundException = e4;
                        C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", classNotFoundException);
                        f188855o = method6;
                        f188856p = constructor;
                    } catch (NoSuchMethodException e5) {
                        noSuchMethodException = e5;
                        C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", noSuchMethodException);
                        f188855o = method6;
                        f188856p = constructor;
                    }
                    f188855o = method6;
                    f188856p = constructor;
                } catch (NoSuchMethodException e6) {
                    e2 = e6;
                    method8 = null;
                    method7 = method8;
                    noSuchMethodException2 = e2;
                    C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", noSuchMethodException2);
                    method3 = null;
                    method2 = method8;
                    method = method7;
                    f188852l = method4;
                    f188853m = method5;
                    f188854n = method2;
                    f188850j = method;
                    f188851k = method3;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                    f188855o = method6;
                    f188856p = constructor;
                }
                try {
                    Class<?> cls3 = Class.forName("android.net.ssl.SSLSockets");
                    method = cls3.getMethod("isSupportedSocket", new Class[]{SSLSocket.class});
                    try {
                        method3 = cls3.getMethod("setUseSessionTickets", new Class[]{SSLSocket.class, Boolean.TYPE});
                    } catch (ClassNotFoundException e7) {
                        classNotFoundException2 = e7;
                        method9 = method2;
                        method10 = method;
                        C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", classNotFoundException2);
                        method3 = null;
                        method2 = method8;
                        method = method7;
                        f188852l = method4;
                        f188853m = method5;
                        f188854n = method2;
                        f188850j = method;
                        f188851k = method3;
                        method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                        f188855o = method6;
                        f188856p = constructor;
                    } catch (NoSuchMethodException e8) {
                        noSuchMethodException2 = e8;
                        method8 = method2;
                        method7 = method;
                        C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", noSuchMethodException2);
                        method3 = null;
                        method2 = method8;
                        method = method7;
                        f188852l = method4;
                        f188853m = method5;
                        f188854n = method2;
                        f188850j = method;
                        f188851k = method3;
                        method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                        f188855o = method6;
                        f188856p = constructor;
                    }
                } catch (ClassNotFoundException e9) {
                    method10 = null;
                    classNotFoundException2 = e9;
                    method9 = method2;
                    C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", classNotFoundException2);
                    method3 = null;
                    method2 = method8;
                    method = method7;
                    f188852l = method4;
                    f188853m = method5;
                    f188854n = method2;
                    f188850j = method;
                    f188851k = method3;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                    f188855o = method6;
                    f188856p = constructor;
                } catch (NoSuchMethodException e10) {
                    method7 = null;
                    noSuchMethodException2 = e10;
                    method8 = method2;
                    C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", noSuchMethodException2);
                    method3 = null;
                    method2 = method8;
                    method = method7;
                    f188852l = method4;
                    f188853m = method5;
                    f188854n = method2;
                    f188850j = method;
                    f188851k = method3;
                    method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                    f188855o = method6;
                    f188856p = constructor;
                }
            } catch (ClassNotFoundException e11) {
                e = e11;
                method5 = null;
                method9 = null;
                method10 = method9;
                classNotFoundException2 = e;
                C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", classNotFoundException2);
                method3 = null;
                method2 = method8;
                method = method7;
                f188852l = method4;
                f188853m = method5;
                f188854n = method2;
                f188850j = method;
                f188851k = method3;
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                f188855o = method6;
                f188856p = constructor;
            } catch (NoSuchMethodException e12) {
                e2 = e12;
                method5 = null;
                method8 = null;
                method7 = method8;
                noSuchMethodException2 = e2;
                C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", noSuchMethodException2);
                method3 = null;
                method2 = method8;
                method = method7;
                f188852l = method4;
                f188853m = method5;
                f188854n = method2;
                f188850j = method;
                f188851k = method3;
                method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
                f188855o = method6;
                f188856p = constructor;
            }
        } catch (ClassNotFoundException e13) {
            e = e13;
            method5 = null;
            method4 = null;
            method9 = null;
            method10 = method9;
            classNotFoundException2 = e;
            C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", classNotFoundException2);
            method3 = null;
            method2 = method8;
            method = method7;
            f188852l = method4;
            f188853m = method5;
            f188854n = method2;
            f188850j = method;
            f188851k = method3;
            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
            f188855o = method6;
            f188856p = constructor;
        } catch (NoSuchMethodException e14) {
            e2 = e14;
            method5 = null;
            method4 = null;
            method8 = null;
            method7 = method8;
            noSuchMethodException2 = e2;
            C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", noSuchMethodException2);
            method3 = null;
            method2 = method8;
            method = method7;
            f188852l = method4;
            f188853m = method5;
            f188854n = method2;
            f188850j = method;
            f188851k = method3;
            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
            f188855o = method6;
            f188856p = constructor;
        }
        f188852l = method4;
        f188853m = method5;
        f188854n = method2;
        f188850j = method;
        f188851k = method3;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", new Class[]{List.class});
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{String.class});
        } catch (ClassNotFoundException e15) {
            classNotFoundException = e15;
            method6 = null;
            C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", classNotFoundException);
            f188855o = method6;
            f188856p = constructor;
        } catch (NoSuchMethodException e16) {
            noSuchMethodException = e16;
            method6 = null;
            C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", noSuchMethodException);
            f188855o = method6;
            f188856p = constructor;
        }
        f188855o = method6;
        f188856p = constructor;
    }

    public C70809ac(C70803p pVar) {
        super(pVar);
    }

    /* renamed from: a */
    public final String mo62518a(SSLSocket sSLSocket) {
        Method method = f188854n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                if (e2.getTargetException() instanceof UnsupportedOperationException) {
                    C70810ad.f188857a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    throw new RuntimeException(e2);
                }
            }
        }
        if (this.f188860c.mo62507c() == 1) {
            try {
                byte[] bArr = (byte[]) f188846f.mo62499a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, C70806s.f188833b);
                }
            } catch (Exception e3) {
                C70810ad.f188857a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", e3);
            }
        }
        if (this.f188860c.mo62507c() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) f188848h.mo62499a(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, C70806s.f188833b);
            }
            return null;
        } catch (Exception e4) {
            C70810ad.f188857a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", e4);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo62519b(SSLSocket sSLSocket, String str, List list) {
        String a = mo62518a(sSLSocket);
        return a == null ? super.mo62519b(sSLSocket, str, list) : a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        throw new java.lang.RuntimeException(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0131, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0138, code lost:
        throw new java.lang.RuntimeException(r9);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4 A[Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123, IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0123 A[ExcHandler: InstantiationException (r9v3 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:7:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0131 A[ExcHandler: IllegalAccessException (r9v1 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:7:0x002d] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62520c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0009:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x001b
            java.lang.Object r2 = r1.next()
            io.grpc.g.a.q r2 = (p5488io.grpc.p5527g.p5528a.C70804q) r2
            java.lang.String r2 = r2.f188824e
            r0.add(r2)
            goto L_0x0009
        L_0x001b:
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            javax.net.ssl.SSLParameters r2 = r9.getSSLParameters()
            r3 = 1
            if (r10 == 0) goto L_0x00ad
            java.lang.String r4 = "_"
            boolean r4 = r10.contains(r4)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r4 == 0) goto L_0x0035
            goto L_0x00ad
        L_0x0035:
            java.net.URI r4 = p5488io.grpc.p5525e.C70460dv.m102879g(r10)     // Catch:{ IllegalArgumentException -> 0x00ad }
            java.lang.String r5 = r4.getHost()     // Catch:{ IllegalArgumentException -> 0x00ad }
            if (r5 == 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            java.lang.String r6 = "No host in authority '%s'"
            com.google.common.base.C58838bb.m90873h(r5, r6, r10)     // Catch:{ IllegalArgumentException -> 0x00ad }
            java.lang.String r4 = r4.getUserInfo()     // Catch:{ IllegalArgumentException -> 0x00ad }
            if (r4 != 0) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            java.lang.String r5 = "Userinfo must not be present on authority: '%s'"
            com.google.common.base.C58838bb.m90873h(r4, r5, r10)     // Catch:{ IllegalArgumentException -> 0x00ad }
            java.lang.reflect.Method r4 = f188850j     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r5[r1] = r9     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r6 = 0
            java.lang.Object r4 = r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            boolean r4 = r4.booleanValue()     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r4 == 0) goto L_0x007b
            java.lang.reflect.Method r4 = f188851k     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r5[r1] = r9     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r5[r3] = r7     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            goto L_0x0088
        L_0x007b:
            io.grpc.g.a.h r4 = f188844d     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r5[r1] = r6     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r4.mo62501c(r9, r5)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
        L_0x0088:
            java.lang.reflect.Method r4 = f188855o     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r4 == 0) goto L_0x00a4
            java.lang.reflect.Constructor r5 = f188856p     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r5 == 0) goto L_0x00a4
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r7[r1] = r10     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Object r10 = r5.newInstance(r7)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.util.List r10 = java.util.Collections.singletonList(r10)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r6[r1] = r10     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r4.invoke(r2, r6)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            goto L_0x00ad
        L_0x00a4:
            io.grpc.g.a.h r4 = f188845e     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r5[r1] = r10     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            r4.mo62501c(r9, r5)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
        L_0x00ad:
            java.lang.reflect.Method r10 = f188854n     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r10 == 0) goto L_0x00d9
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123 }
            r10.invoke(r9, r4)     // Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123 }
            java.lang.reflect.Method r10 = f188852l     // Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123 }
            r4[r1] = r0     // Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123 }
            r10.invoke(r2, r4)     // Catch:{ InvocationTargetException -> 0x00c1, IllegalAccessException -> 0x0131, InstantiationException -> 0x0123 }
            r10 = 1
            goto L_0x00da
        L_0x00c1:
            r10 = move-exception
            java.lang.Throwable r4 = r10.getTargetException()     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            boolean r4 = r4 instanceof java.lang.UnsupportedOperationException     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r4 == 0) goto L_0x00d8
            java.util.logging.Logger r10 = p5488io.grpc.p5527g.C70810ad.f188857a     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.util.logging.Level r4 = java.util.logging.Level.FINER     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.String r5 = "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator"
            java.lang.String r6 = "configureTlsExtensions"
            java.lang.String r7 = "setApplicationProtocol unsupported, will try old methods"
            r10.logp(r4, r5, r6, r7)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            goto L_0x00d9
        L_0x00d8:
            throw r10     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
        L_0x00d9:
            r10 = 0
        L_0x00da:
            r9.setSSLParameters(r2)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r10 == 0) goto L_0x00f7
            java.lang.reflect.Method r10 = f188853m     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r10 == 0) goto L_0x00f7
            javax.net.ssl.SSLParameters r2 = r9.getSSLParameters()     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.Object r10 = r10.invoke(r2, r4)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            boolean r10 = java.util.Arrays.equals(r0, r10)     // Catch:{ IllegalAccessException -> 0x0131, InvocationTargetException -> 0x012a, InstantiationException -> 0x0123 }
            if (r10 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            return
        L_0x00f7:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            byte[] r11 = p5488io.grpc.p5527g.p5528a.C70803p.m103566e(r11)
            r10[r1] = r11
            io.grpc.g.a.p r11 = r8.f188860c
            int r11 = r11.mo62507c()
            if (r11 != r3) goto L_0x010c
            io.grpc.g.a.h r11 = f188847g
            r11.mo62499a(r9, r10)
        L_0x010c:
            io.grpc.g.a.p r11 = r8.f188860c
            int r11 = r11.mo62507c()
            r0 = 3
            if (r11 == r0) goto L_0x011b
            io.grpc.g.a.h r11 = f188849i
            r11.mo62499a(r9, r10)
            return
        L_0x011b:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS"
            r9.<init>(r10)
            throw r9
        L_0x0123:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L_0x012a:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L_0x0131:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            goto L_0x0139
        L_0x0138:
            throw r10
        L_0x0139:
            goto L_0x0138
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.C70809ac.mo62520c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }
}
