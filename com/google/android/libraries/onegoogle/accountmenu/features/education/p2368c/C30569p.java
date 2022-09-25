package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30870ac;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30874c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.p */
/* compiled from: PG */
public abstract class C30569p {
    /* renamed from: a */
    public abstract C28421h mo36214a();

    /* renamed from: b */
    public abstract C30158c mo36215b();

    /* renamed from: c */
    public abstract C30253a mo36216c();

    /* renamed from: d */
    public abstract C30570q mo36217d();

    /* renamed from: e */
    public abstract C58833ax mo36218e();

    /* renamed from: f */
    public abstract C58833ax mo36219f();

    /* renamed from: g */
    public abstract void mo36220g(C58528ij ijVar);

    /* renamed from: h */
    public abstract void mo36221h(C30870ac acVar);

    /* renamed from: i */
    public abstract void mo36222i(int i);

    /* renamed from: j */
    public abstract void mo36223j(C30555b bVar);

    /* renamed from: k */
    public final C30570q mo36255k() {
        C30158c b = mo36215b();
        if (b != null) {
            C30253a c = mo36216c();
            C28421h a = mo36214a();
            C30313v vVar = (C30313v) mo36219f().mo56111f();
            C58833ax e = mo36218e();
            if (e != null) {
                mo36221h(new C30874c(a, b, c, vVar, e));
                return mo36217d();
            }
            throw new NullPointerException("Null appIdentifier");
        }
        throw new NullPointerException("Null accountConverter");
    }
}
