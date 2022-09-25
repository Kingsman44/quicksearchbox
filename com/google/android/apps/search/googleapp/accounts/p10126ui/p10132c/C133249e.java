package com.google.android.apps.search.googleapp.accounts.p10126ui.p10132c;

import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30556c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30565l;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30566m;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30567n;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30568o;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30569p;
import com.google.apps.tiktok.account.p3616e.p3623f.C46355c;
import com.google.common.p4522b.C58733pz;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.c.e */
/* compiled from: PG */
public final class C133249e implements C68220f {
    /* renamed from: a */
    public static C30569p m216255a(C28421h hVar, C46355c cVar, C30306o oVar) {
        C30556c cVar2 = new C30556c();
        cVar2.f82532c = 1;
        byte b = cVar2.f82539j;
        cVar2.f82533d = 1;
        cVar2.f82539j = (byte) (b | 3);
        cVar2.f82535f = C30565l.f82582a;
        cVar2.f82534e = C30566m.f82583a;
        cVar2.mo36220g(C58733pz.f156496a);
        cVar2.f82536g = true;
        byte b2 = cVar2.f82539j;
        cVar2.f82542m = C30567n.f82584a;
        cVar2.f82539j = (byte) (b2 | 12);
        cVar2.f82541l = 1;
        cVar2.f82538i = C30568o.f82585a;
        cVar2.f82540k = 1;
        if (cVar != null) {
            cVar2.f82530a = cVar;
            if (oVar != null) {
                cVar2.f82531b = oVar;
                cVar2.f82534e = C133247c.f363173a;
                cVar2.f82541l = 2;
                if (hVar != null) {
                    cVar2.f82537h = hVar;
                    return cVar2;
                }
                throw new NullPointerException("Null vePrimitives");
            }
            throw new NullPointerException("Null accountsModel");
        }
        throw new NullPointerException("Null accountConverter");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
