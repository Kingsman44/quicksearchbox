package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.common.base.C58817ah;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55247lh;
import com.google.p4152bb.p4153a.C55419v;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.h */
/* compiled from: PG */
public final /* synthetic */ class C87444h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C55235kw f236218a;

    public /* synthetic */ C87444h(C55235kw kwVar) {
        this.f236218a = kwVar;
    }

    public final Object apply(Object obj) {
        int i;
        String str;
        C55136he heVar;
        C55235kw kwVar = this.f236218a;
        C55247lh lhVar = (C55247lh) obj;
        String str2 = lhVar.f145480b;
        String str3 = lhVar.f145481c;
        String str4 = lhVar.f145483e;
        int i2 = lhVar.f145479a;
        if ((i2 & 64) != 0) {
            int a = C55419v.m87685a(lhVar.f145484f);
            i = a == 0 ? 1 : a;
        } else {
            i = 0;
        }
        String str5 = lhVar.f145482d;
        if ((i2 & 128) != 0) {
            str = lhVar.f145485g;
        } else {
            str = kwVar.f145436h;
        }
        String str6 = str;
        if ((i2 & 512) != 0) {
            heVar = lhVar.f145487j;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
        } else {
            heVar = null;
        }
        return new EntityArgument.Entity(str2, str3, str4, (Bitmap) null, i, str5, (String) null, str6, heVar, new C62963cj(lhVar.f145486h, C55247lh.f145476i), false, 0);
    }
}
