package com.google.android.libraries.onegoogle.accountmenu.cards;

import androidx.lifecycle.C2333ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.bq */
/* compiled from: PG */
final class C30389bq implements C2333ah {

    /* renamed from: a */
    private final C30453u f82143a;

    public C30389bq(C30453u uVar) {
        this.f82143a = uVar;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        String str;
        C30451s sVar = (C30451s) obj;
        if (sVar.mo36040b() == 11) {
            C58838bb.m90869d(sVar.mo36039a().mo56113h(), "STORAGE_FAILURE has to include upload info");
            int a = ((C30452t) sVar.mo36039a().mo56107c()).mo36041a();
            C30349ad a2 = this.f82143a.mo36043a();
            if (a > 0) {
                str = a2.mo35926o();
            } else {
                str = a2.mo35922k();
            }
            C58833ax.m90834k(str);
            throw null;
        }
        throw null;
    }
}
