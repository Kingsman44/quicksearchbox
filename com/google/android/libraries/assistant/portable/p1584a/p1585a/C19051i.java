package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import com.google.assistant.p3897e.p3917i.p3918a.C51370fe;
import com.google.assistant.p3897e.p3917i.p3918a.C51371ff;
import com.google.assistant.p3897e.p3917i.p3918a.C51372fg;
import com.google.assistant.p3897e.p3917i.p3918a.C51373fh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68014d;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.C63641y;
import com.google.protos.p4850an.C63642z;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.i */
/* compiled from: PG */
public final class C19051i {

    /* renamed from: a */
    private static final C59071e f53456a = C59071e.m91332i("com.google.android.libraries.assistant.portable.a.a.i");

    /* renamed from: a */
    public static void m36516a(C63634r rVar, C51370fe feVar) {
        C58833ax axVar;
        C58833ax axVar2;
        C63641y yVar = (C63641y) C63642z.f172112e.createBuilder();
        String str = rVar.f172101d;
        Iterator it = Collections.unmodifiableList(((C51373fh) feVar.instance).f133804a).iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                axVar = C58836b.f156633a;
                break;
            }
            Iterator it2 = ((C51372fg) it.next()).f133797d.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C68014d dVar = (C68014d) it2.next();
                    C61752n nVar = dVar.f184280c;
                    if (nVar == null) {
                        nVar = C61752n.f166808f;
                    }
                    Iterator it3 = nVar.f166812c.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((C61746h) it3.next()).f166796d.equals(str)) {
                                axVar = C58833ax.m90834k(dVar.f184279b);
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            yVar.copyOnWrite();
            C63642z zVar = (C63642z) yVar.instance;
            str2.getClass();
            zVar.f172114a |= 1;
            zVar.f172115b = str2;
        }
        String str3 = rVar.f172101d;
        Iterator it4 = Collections.unmodifiableList(((C51373fh) feVar.instance).f133804a).iterator();
        loop3:
        while (true) {
            if (!it4.hasNext()) {
                axVar2 = C58836b.f156633a;
                break;
            }
            Iterator it5 = ((C51372fg) it4.next()).f133797d.iterator();
            while (true) {
                if (it5.hasNext()) {
                    C61752n nVar2 = ((C68014d) it5.next()).f184280c;
                    if (nVar2 == null) {
                        nVar2 = C61752n.f166808f;
                    }
                    String str4 = nVar2.f166811b;
                    Iterator it6 = nVar2.f166812c.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (((C61746h) it6.next()).f166796d.equals(str3)) {
                                axVar2 = C58833ax.m90834k(str4);
                                break loop3;
                            }
                        }
                    }
                }
            }
        }
        if (axVar2.mo56113h()) {
            String str5 = (String) axVar2.mo56107c();
            yVar.copyOnWrite();
            C63642z zVar2 = (C63642z) yVar.instance;
            str5.getClass();
            zVar2.f172114a |= 2;
            zVar2.f172116c = str5;
        }
        yVar.mo59226c(rVar);
        C63642z zVar3 = (C63642z) yVar.build();
        if (((C51373fh) feVar.instance).f133804a.size() == 1) {
            C51371ff ffVar = (C51371ff) feVar.mo53596a(0).toBuilder();
            if (zVar3.f172117d.size() == 1) {
                C63634r rVar2 = (C63634r) zVar3.f172117d.get(0);
                for (int i = 0; i < ((C51372fg) ffVar.instance).f133798e.size(); i++) {
                    C63642z zVar4 = (C63642z) ((C51372fg) ffVar.instance).f133798e.get(i);
                    if (zVar4.f172115b.equals(zVar3.f172115b)) {
                        if (zVar4.f172117d.size() != 1) {
                            ((C59052c) ((C59052c) f53456a.mo56225c()).mo56372aa(47540)).mo56386p("addOrMergeIntentUpdateToDialogStateParams: only one ArgumentUpdate is expected for each existingIntentUpdate.");
                        } else if (rVar2.f172101d.equals(((C63634r) zVar4.f172117d.get(0)).f172101d)) {
                            ffVar.copyOnWrite();
                            C51372fg fgVar = (C51372fg) ffVar.instance;
                            zVar3.getClass();
                            fgVar.mo53605b();
                            fgVar.f133798e.set(i, zVar3);
                            feVar.mo53599d(0, (C51372fg) ffVar.build());
                            return;
                        }
                    }
                }
                ffVar.mo53602c(zVar3);
                feVar.mo53599d(0, (C51372fg) ffVar.build());
                return;
            }
            ((C59052c) ((C59052c) f53456a.mo56225c()).mo56372aa(47541)).mo56386p("addOrMergeIntentUpdateToDialogStateParams: only one ArgumentUpdate is expected for each intentUpdate.");
            ffVar.mo53602c(zVar3);
            feVar.mo53599d(0, (C51372fg) ffVar.build());
        }
    }

    /* renamed from: b */
    static void m36517b(Map map, C51370fe feVar) {
        for (C63634r a : map.values()) {
            m36516a(a, feVar);
        }
    }
}
