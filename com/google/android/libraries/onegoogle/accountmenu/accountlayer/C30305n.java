package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

import android.content.Context;
import androidx.core.p097i.C1978m;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.p2344a.C30155a;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.n */
/* compiled from: PG */
public abstract class C30305n {
    /* renamed from: f */
    public static C30304m m56405f(Context context, Class cls) {
        C30309r rVar = new C30309r();
        rVar.f81948j = cls;
        rVar.mo35845s(C30518b.m56960a().mo36129a());
        rVar.mo35844r(C30474o.m56824h().mo36084a());
        rVar.f81949k = new C30296e();
        rVar.f81932a = context.getApplicationContext();
        return rVar;
    }

    /* renamed from: t */
    public static boolean m56406t(Context context, C1978m mVar) {
        return ((Boolean) C30155a.m56016a(context, mVar, false)).booleanValue();
    }

    /* renamed from: a */
    public abstract C28421h mo35851a();

    /* renamed from: b */
    public abstract C30158c mo35852b();

    /* renamed from: c */
    public abstract C30213m mo35853c();

    /* renamed from: d */
    public abstract C30213m mo35854d();

    /* renamed from: e */
    public abstract C30294c mo35855e();

    /* renamed from: g */
    public final C30304m mo35856g(Context context) {
        C30304m h = mo35857h();
        h.f81932a = context.getApplicationContext();
        return h;
    }

    /* renamed from: h */
    public abstract C30304m mo35857h();

    /* renamed from: i */
    public abstract C30306o mo35858i();

    /* renamed from: j */
    public abstract C30474o mo35859j();

    /* renamed from: k */
    public abstract C30518b mo35860k();

    /* renamed from: l */
    public abstract C30830g mo35861l();

    /* renamed from: m */
    public abstract C30860b mo35862m();

    /* renamed from: n */
    public abstract C30847m mo35863n();

    /* renamed from: o */
    public abstract C30897z mo35864o();

    /* renamed from: p */
    public abstract C58833ax mo35865p();

    /* renamed from: q */
    public abstract C58833ax mo35866q();

    /* renamed from: r */
    public abstract Class mo35867r();

    /* renamed from: s */
    public abstract ExecutorService mo35868s();
}
