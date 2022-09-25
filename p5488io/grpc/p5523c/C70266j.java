package p5488io.grpc.p5523c;

import android.util.Log;
import com.google.common.base.C58838bb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5525e.C70357a;
import p5488io.grpc.p5525e.C70411c;
import p5488io.grpc.p5525e.C70438d;
import p5488io.grpc.p5525e.C70573i;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70679ly;

/* renamed from: io.grpc.c.j */
/* compiled from: PG */
public final class C70266j extends C70438d {

    /* renamed from: a */
    public static final ByteBuffer f187298a = ByteBuffer.allocateDirect(0);
    @Deprecated

    /* renamed from: b */
    static final C70846h f187299b = new C70846h("cronet-annotation", (Object) null);

    /* renamed from: c */
    static final C70846h f187300c = new C70846h("cronet-annotations", (Object) null);

    /* renamed from: t */
    private static volatile boolean f187301t;

    /* renamed from: u */
    private static volatile Method f187302u;

    /* renamed from: d */
    public final String f187303d;

    /* renamed from: e */
    public final String f187304e;

    /* renamed from: f */
    public final C70670lp f187305f;

    /* renamed from: g */
    public final Executor f187306g;

    /* renamed from: h */
    public final C70334de f187307h;

    /* renamed from: i */
    public final C70269m f187308i;

    /* renamed from: j */
    public final Runnable f187309j;

    /* renamed from: k */
    public BidirectionalStream f187310k;

    /* renamed from: l */
    public final boolean f187311l;

    /* renamed from: m */
    public final Object f187312m;

    /* renamed from: n */
    public final Collection f187313n;

    /* renamed from: o */
    public final C70265i f187314o;

    /* renamed from: p */
    public C70259c f187315p;

    /* renamed from: v */
    private final C70264h f187316v = new C70264h(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70266j(String str, String str2, Executor executor, C70334de deVar, C70269m mVar, Runnable runnable, Object obj, int i, C70338di diVar, C70670lp lpVar, C70851i iVar, C70679ly lyVar) {
        super(new C70271o(), lpVar, lyVar, deVar, iVar);
        C70851i iVar2 = iVar;
        this.f187303d = str;
        this.f187304e = str2;
        this.f187305f = lpVar;
        this.f187306g = executor;
        C58838bb.m90866a(deVar, "headers");
        this.f187307h = deVar;
        this.f187308i = mVar;
        this.f187309j = runnable;
        this.f187311l = diVar.f187496a == C70337dh.UNARY;
        this.f187312m = iVar2.mo62571g(f187299b);
        this.f187313n = (Collection) iVar2.mo62571g(f187300c);
        C70265i iVar3 = new C70265i(this, i, lpVar, obj, lyVar);
        this.f187314o = iVar3;
        iVar3.mo62325n();
    }

    /* renamed from: p */
    public static C70851i m102424p(C70851i iVar, Object obj) {
        ArrayList arrayList;
        C70846h hVar = f187300c;
        Collection collection = (Collection) iVar.mo62571g(hVar);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arrayList.add(obj);
        return iVar.mo62569e(hVar, Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public static void m102425t(ExperimentalBidirectionalStream.Builder builder, Object obj) {
        if (!f187301t) {
            synchronized (C70266j.class) {
                if (!f187301t) {
                    try {
                        f187302u = ExperimentalBidirectionalStream.Builder.class.getMethod("addRequestAnnotation", new Class[]{Object.class});
                        f187301t = true;
                    } catch (NoSuchMethodException e) {
                        try {
                            Log.w("grpc-java-cronet", "Failed to load method ExperimentalBidirectionalStream.Builder.addRequestAnnotation", e);
                            f187301t = true;
                        } catch (Throwable th) {
                            f187301t = true;
                            throw th;
                        }
                    }
                }
            }
        }
        if (f187302u != null) {
            try {
                f187302u.invoke(builder, new Object[]{obj});
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause() == null ? e2.getTargetException() : e2.getCause());
            } catch (IllegalAccessException e3) {
                Log.w("grpc-java-cronet", "Failed to add request annotation: ".concat(String.valueOf(String.valueOf(obj))), e3);
            }
        }
    }

    /* renamed from: a */
    public final C70256c mo61755a() {
        return C70256c.f187254a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final /* synthetic */ C70357a mo61924q() {
        return this.f187316v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final /* synthetic */ C70411c mo61925r() {
        return this.f187314o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ C70573i mo61926s() {
        return this.f187314o;
    }

    /* renamed from: u */
    public final void mo61927u(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.f187310k != null) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.write");
            }
            this.f187310k.write(byteBuffer, z);
            if (z2) {
                if (Log.isLoggable("grpc-java-cronet", 2)) {
                    Log.v("grpc-java-cronet", "BidirectionalStream.flush");
                }
                this.f187310k.flush();
            }
        }
    }
}
