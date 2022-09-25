package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.ContentResolver;
import com.google.android.apps.gsa.contacts.cr;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52293mj;
import com.google.assistant.p3897e.p3921j.C52294mk;
import com.google.assistant.p3897e.p3921j.C52295ml;
import com.google.assistant.p3897e.p3921j.C52296mm;
import com.google.assistant.p3897e.p3921j.C52297mn;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.d */
/* compiled from: PG */
public final /* synthetic */ class C93032d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C93033e f259507a;

    /* renamed from: b */
    public final /* synthetic */ Set f259508b;

    /* renamed from: c */
    public final /* synthetic */ List f259509c;

    /* renamed from: d */
    public final /* synthetic */ List f259510d;

    /* renamed from: e */
    public final /* synthetic */ String f259511e;

    /* renamed from: f */
    public final /* synthetic */ List f259512f;

    public /* synthetic */ C93032d(C93033e eVar, Set set, List list, List list2, String str, List list3) {
        this.f259507a = eVar;
        this.f259508b = set;
        this.f259509c = list;
        this.f259510d = list2;
        this.f259511e = str;
        this.f259512f = list3;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        C93033e eVar = this.f259507a;
        Set set = this.f259508b;
        List list = this.f259509c;
        List list2 = this.f259510d;
        String str = this.f259511e;
        List<C52297mn> list3 = this.f259512f;
        List m = ((C84418a) eVar.f259514b.mo27525b()).mo77984a().m(set, list, list2, str, "opa-call-history-contact-lookup");
        ContentResolver contentResolver = eVar.f259513a;
        C52293mj mjVar = (C52293mj) C52296mm.f137279b.createBuilder();
        for (C52297mn mnVar : list3) {
            if (mnVar != C52297mn.UNKNOWN_TYPE) {
                int ordinal = mnVar.ordinal();
                boolean z2 = true;
                boolean z3 = false;
                if (ordinal == 1) {
                    z = false;
                    z2 = false;
                    z3 = true;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        z = true;
                    } else if (ordinal != 4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 = false;
                } else {
                    z = false;
                }
                C52294mk b = cr.b(cr.d(m, z2, z3, z, contentResolver));
                if (b != null) {
                    b.copyOnWrite();
                    C52295ml mlVar = C52295ml.f137275c;
                    ((C52295ml) b.instance).f137277a = mnVar.getNumber();
                    mjVar.mo53826a(b);
                }
            }
        }
        if (Collections.unmodifiableList(((C52296mm) mjVar.instance).f137281a).isEmpty()) {
            return C22402a.m41822b(C52235kf.NOT_FOUND, "Cannot find any matching recent contact.");
        }
        return C93033e.m153100b((C52296mm) mjVar.build());
    }
}
