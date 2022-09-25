package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.C2664h;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2616d;
import androidx.media3.exoplayer.p145h.C3035ar;
import com.google.common.base.C58817ah;
import com.google.common.base.C58881cr;

/* renamed from: androidx.media3.exoplayer.ac */
/* compiled from: PG */
public final class C2758ac {

    /* renamed from: a */
    final Context f7638a;

    /* renamed from: b */
    C2616d f7639b;

    /* renamed from: c */
    C58881cr f7640c;

    /* renamed from: d */
    C58881cr f7641d;

    /* renamed from: e */
    C58881cr f7642e;

    /* renamed from: f */
    C58881cr f7643f;

    /* renamed from: g */
    C58881cr f7644g;

    /* renamed from: h */
    C58817ah f7645h;

    /* renamed from: i */
    Looper f7646i;

    /* renamed from: j */
    C2664h f7647j;

    /* renamed from: k */
    boolean f7648k;

    /* renamed from: l */
    public int f7649l;

    /* renamed from: m */
    public boolean f7650m;

    /* renamed from: n */
    int f7651n;

    /* renamed from: o */
    public boolean f7652o;

    /* renamed from: p */
    C2897cz f7653p;

    /* renamed from: q */
    public long f7654q;

    /* renamed from: r */
    public long f7655r;

    /* renamed from: s */
    long f7656s;

    /* renamed from: t */
    long f7657t;

    /* renamed from: u */
    public boolean f7658u;

    /* renamed from: v */
    boolean f7659v;

    /* renamed from: w */
    public boolean f7660w;

    /* renamed from: x */
    C3192j f7661x;

    public C2758ac(Context context) {
        this(context, new C3322y(context), new C2757ab(context));
    }

    /* renamed from: a */
    public final C2759ad mo6454a() {
        C2601a.m6832d(!this.f7660w);
        this.f7660w = true;
        return new C2848br(this);
    }

    /* renamed from: b */
    public final void mo6455b(C2664h hVar) {
        C2601a.m6832d(!this.f7660w);
        this.f7647j = hVar;
        this.f7648k = true;
    }

    /* renamed from: c */
    public final void mo6456c(C2875cd cdVar) {
        C2601a.m6832d(!this.f7660w);
        cdVar.getClass();
        this.f7643f = new C3269q(cdVar);
    }

    /* renamed from: d */
    public final void mo6457d(Looper looper) {
        C2601a.m6832d(!this.f7660w);
        looper.getClass();
        this.f7646i = looper;
    }

    /* renamed from: e */
    public final void mo6458e(C3035ar arVar) {
        C2601a.m6832d(!this.f7660w);
        this.f7641d = new C3272t(arVar);
    }

    public C2758ac(Context context, C2896cy cyVar) {
        this(context, new C3273u(cyVar), new C3274v(context));
        cyVar.getClass();
    }

    public C2758ac(Context context, C58881cr crVar, C58881cr crVar2) {
        C3320w wVar = new C3320w(context);
        C3321x xVar = C3321x.f10027a;
        C3323z zVar = new C3323z(context);
        C2756aa aaVar = C2756aa.f7636a;
        context.getClass();
        this.f7638a = context;
        this.f7640c = crVar;
        this.f7641d = crVar2;
        this.f7642e = wVar;
        this.f7643f = xVar;
        this.f7644g = zVar;
        this.f7645h = aaVar;
        this.f7646i = C2612ak.m6923F();
        this.f7647j = C2664h.f7421a;
        this.f7649l = 0;
        this.f7651n = 1;
        this.f7652o = true;
        this.f7653p = C2897cz.f8203b;
        this.f7654q = 5000;
        this.f7655r = 15000;
        this.f7661x = new C3192j(C2612ak.m6998w(20), C2612ak.m6998w(500));
        this.f7639b = C2616d.f7266a;
        this.f7656s = 500;
        this.f7657t = 2000;
        this.f7659v = true;
    }
}
