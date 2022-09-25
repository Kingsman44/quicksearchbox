package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.C91651c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7713he;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.h */
/* compiled from: PG */
public abstract class C91693h implements C91651c {

    /* renamed from: a */
    private static final C59071e f255780a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.cards.h");

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo85585d(C7718hj hjVar, List list, Object obj);

    /* renamed from: g */
    public final Object mo86201g(C7718hj hjVar, List list, Object obj) {
        if (hjVar != null) {
            int a = C7713he.m22812a(hjVar.f26985z);
            if (a != 0 && a == 4) {
                return null;
            }
            if (list.isEmpty()) {
                C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
                if (a2 == null) {
                    a2 = C7746ik.UNKNOWN;
                }
                if (a2 != C7746ik.CLOSET_INTEREST_CATEGORY) {
                    C7746ik a3 = C7746ik.m22834a(hjVar.f26966g);
                    if (a3 == null) {
                        a3 = C7746ik.UNKNOWN;
                    }
                    if (a3 != C7746ik.CLOSET_TEMPLATE_GROUP) {
                        ((C59052c) ((C59052c) f255780a.mo56226d()).mo56372aa(11845)).mo56386p("Skipping EntryTreeNode with no group entry and no children");
                        return null;
                    }
                }
            }
            return mo85585d(hjVar, list, obj);
        } else if (list.isEmpty()) {
            ((C59052c) ((C59052c) f255780a.mo56226d()).mo56372aa(11844)).mo56386p("Malformed entry. The entryTreeNode needs either a groupEntry or an entry.");
            int i = C90755l.f253831a;
            return null;
        } else if (list.size() <= 1) {
            return mo85588l((C7718hj) list.get(0), obj);
        } else {
            ((C59052c) ((C59052c) f255780a.mo56226d()).mo56372aa(11843)).mo56386p("Malformed entry. Multiple entries without a groupEntry are not allowed.");
            int i2 = C90755l.f253831a;
            return null;
        }
    }

    /* renamed from: h */
    public Object mo86202h(C7718hj hjVar, List list) {
        throw null;
    }

    /* renamed from: j */
    public final Object mo85797j(C7718hj hjVar) {
        return mo85588l(hjVar, (Object) null);
    }

    /* renamed from: k */
    public final Object mo85798k(C7718hj hjVar, List list) {
        return mo86201g(hjVar, list, (Object) null);
    }

    /* renamed from: l */
    public abstract Object mo85588l(C7718hj hjVar, Object obj);
}
