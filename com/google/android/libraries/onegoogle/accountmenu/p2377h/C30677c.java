package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import com.google.android.libraries.onegoogle.account.disc.C30213m;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30263h;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30272q;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.c */
/* compiled from: PG */
final class C30677c {
    /* renamed from: a */
    static C30263h m57333a(C30305n nVar) {
        Class r = nVar.mo35867r();
        if (r != null) {
            C30158c b = nVar.mo35852b();
            if (b != null) {
                C30306o i = nVar.mo35858i();
                if (i != null) {
                    boolean d = nVar.mo35859j().mo36092d();
                    C30213m c = nVar.mo35853c();
                    if (c != null) {
                        C30860b m = nVar.mo35862m();
                        if (m != null) {
                            C58833ax l = nVar.mo35860k().mo36179l();
                            if (l != null) {
                                return new C30272q(c, b, i, r, d, m, l);
                            }
                            throw new NullPointerException("Null deactivatedAccountsFeature");
                        }
                        throw new NullPointerException("Null oneGoogleEventLogger");
                    }
                    throw new NullPointerException("Null avatarImageLoader");
                }
                throw new NullPointerException("Null accountsModel");
            }
            throw new NullPointerException("Null accountConverter");
        }
        throw new NullPointerException("Null accountClass");
    }
}
