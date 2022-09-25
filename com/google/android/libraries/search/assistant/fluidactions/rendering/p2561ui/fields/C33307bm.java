package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51018di;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bm */
/* compiled from: PG */
public final /* synthetic */ class C33307bm implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageField f89294a;

    public /* synthetic */ C33307bm(ImageField imageField) {
        this.f89294a = imageField;
    }

    public final void onClick(View view) {
        C51018di diVar;
        ImageField imageField = this.f89294a;
        C51941eu euVar = imageField.f89117a;
        if (euVar != null && imageField.f89118b != null && imageField.f89119c != null) {
            if (euVar.f136277e == 14) {
                diVar = (C51018di) euVar.f136278f;
            } else {
                diVar = C51018di.f132836d;
            }
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = imageField.f89117a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = imageField.f89117a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff a = imageField.f89118b.mo38576a();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            a.getClass();
            ttVar.f137806b = a;
            ttVar.f137805a |= 1;
            C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
            ugVar.mo53877a((C52490tr) tpVar.build());
            tsVar.copyOnWrite();
            C52492tt ttVar2 = (C52492tt) tsVar.instance;
            C52507uh uhVar = (C52507uh) ugVar.build();
            uhVar.getClass();
            ttVar2.f137807c = uhVar;
            ttVar2.f137805a |= 2;
            C52492tt ttVar3 = (C52492tt) tsVar.build();
            C32942a aVar = imageField.f89119c;
            if (aVar != null) {
                C51016dg dgVar = diVar.f132840c;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                aVar.mo38364a("FA Image", ttVar3, dgVar);
            }
        }
    }
}
