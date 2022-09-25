package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.text.TextUtils;
import com.google.android.apps.gsa.contacts.cl;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.assistant.p3897e.p3921j.C52620ym;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52622yo;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52626ys;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.add;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.assistant.p3897e.p3921j.adf;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bi */
/* compiled from: PG */
public final class C76927bi {
    /* renamed from: a */
    static add m123560a(Map map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get("name");
        String str2 = (String) map.get("number");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        long parseLong = !TextUtils.isEmpty((CharSequence) null) ? Long.parseLong((String) null) : 0;
        if (TextUtils.isEmpty(str)) {
            str = C90763bg.m148261a(str2);
        }
        Person person = new Person(parseLong, (String) null, str, (Collection) null);
        person.mo81552D(Collections.singletonList(Contact.m142046c(str2)));
        add add = (add) ade.f134877h.createBuilder();
        C52622yo yoVar = (C52622yo) C52623yp.f138162g.createBuilder();
        String str3 = person.f236373d;
        if (!TextUtils.isEmpty(str3)) {
            C52620ym ymVar = (C52620ym) C52621yn.f138154g.createBuilder();
            ymVar.copyOnWrite();
            C52621yn ynVar = (C52621yn) ymVar.instance;
            str3.getClass();
            ynVar.f138156a |= 2;
            ynVar.f138158c = str3;
            yoVar.mo53892e(ymVar);
        }
        for (Contact contact : C58485gu.m89842j(person.f236374e)) {
            String str4 = contact.f236354e;
            if (!TextUtils.isEmpty(str4)) {
                C52628yu yuVar = (C52628yu) C52629yv.f138180g.createBuilder();
                yuVar.copyOnWrite();
                C52629yv yvVar = (C52629yv) yuVar.instance;
                str4.getClass();
                yvVar.f138182a |= 2;
                yvVar.f138184c = str4;
                C58833ax b = cl.b(str4);
                if (b.mo56113h()) {
                    String str5 = (String) b.mo56107c();
                    yuVar.copyOnWrite();
                    C52629yv yvVar2 = (C52629yv) yuVar.instance;
                    str5.getClass();
                    yvVar2.f138182a |= 8;
                    yvVar2.f138186e = str5;
                }
                yoVar.mo53894g(yuVar);
            }
        }
        C52626ys ysVar = (C52626ys) C52627yt.f138176c.createBuilder();
        ysVar.mo53900b(person.f236371b);
        C52627yt ytVar = (C52627yt) ysVar.build();
        yoVar.copyOnWrite();
        C52623yp ypVar = (C52623yp) yoVar.instance;
        ytVar.getClass();
        ypVar.f138165b = ytVar;
        ypVar.f138164a |= 1;
        adf adf = (adf) adm.f134889h.createBuilder();
        adf.copyOnWrite();
        adm adm = (adm) adf.instance;
        C52623yp ypVar2 = (C52623yp) yoVar.build();
        ypVar2.getClass();
        adm.f134892b = ypVar2;
        adm.f134891a |= 1;
        add.mo53673a((adm) adf.build());
        return add;
    }

    /* renamed from: b */
    public static boolean m123561b(boolean z, boolean z2, boolean z3, int i) {
        if (z && i == 1) {
            return true;
        }
        if (z2 && i == 2) {
            return true;
        }
        if (z3) {
            return i == 3 || i == 5;
        }
        return false;
    }
}
