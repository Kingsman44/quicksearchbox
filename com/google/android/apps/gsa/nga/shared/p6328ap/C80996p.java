package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82507ht;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82991hz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82994ib;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82995ic;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82997ie;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82998if;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83000ih;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.p */
/* compiled from: PG */
public final class C80996p {

    /* renamed from: a */
    private final C83314ii f222016a;

    /* renamed from: b */
    private final C83305i f222017b;

    public C80996p(C83314ii iiVar, C83305i iVar) {
        this.f222016a = iiVar;
        this.f222017b = iVar;
    }

    /* renamed from: b */
    private static Map m128889b(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle == null) {
            return hashMap;
        }
        for (String str : bundle.keySet()) {
            hashMap.put(str, String.valueOf(bundle.get(str)));
        }
        return hashMap;
    }

    /* renamed from: c */
    private final void m128890c(C82994ib ibVar) {
        this.f222016a.mo75555b(ibVar);
        C83305i iVar = this.f222017b;
        C82997ie ieVar = ibVar.f226483f;
        if (ieVar == null) {
            ieVar = C82997ie.f226485g;
        }
        String str = ieVar.f226488b;
        if (str != null) {
            iVar.mo75579d(new C82507ht("VIS_DELEGATION", ibVar.f226479b, str, ibVar.f226480c));
            return;
        }
        throw new NullPointerException("Null viIntentAction");
    }

    /* renamed from: d */
    private static boolean m128891d(Bundle bundle, String str) {
        return bundle != null && bundle.containsKey(str);
    }

    /* renamed from: e */
    private static boolean m128892e(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: a */
    public final boolean mo74774a(Bundle bundle, int i) {
        Optional optional;
        int i2;
        String stringExtra;
        C82991hz hzVar = (C82991hz) C82994ib.f226476g.createBuilder();
        hzVar.copyOnWrite();
        C82994ib ibVar = (C82994ib) hzVar.instance;
        ibVar.f226478a |= 1;
        ibVar.f226479b = false;
        if (bundle == null || !bundle.getBoolean("nga_only_create_session", false)) {
            if (bundle == null || !m128891d(bundle, "com.google.voicesearch.VI_INTENT")) {
                optional = Optional.empty();
            } else {
                Intent intent = (Intent) bundle.getParcelable("com.google.voicesearch.VI_INTENT");
                if (intent == null) {
                    optional = Optional.empty();
                } else {
                    intent.setExtrasClassLoader(getClass().getClassLoader());
                    optional = Optional.m71637of(intent);
                }
            }
            if (optional.isEmpty()) {
                m128890c((C82994ib) hzVar.build());
                return false;
            }
            Intent intent2 = (Intent) optional.get();
            if (intent2.getBooleanExtra("nga_programmatic_context_request", false)) {
                m128890c((C82994ib) hzVar.build());
                return false;
            } else if (m128891d(intent2.getExtras(), "key_is_hotword_triggered") && intent2.getBooleanExtra("key_is_hotword_triggered", false)) {
                m128890c((C82994ib) hzVar.build());
                return false;
            } else if (m128891d(intent2.getExtras(), "source") && (stringExtra = intent2.getStringExtra("source")) != null && (stringExtra.equals("and.opa.bluetooth") || stringExtra.equals("and.opa.wired"))) {
                m128890c((C82994ib) hzVar.build());
                return false;
            } else {
                hzVar.copyOnWrite();
                C82994ib ibVar2 = (C82994ib) hzVar.instance;
                ibVar2.f226478a |= 1;
                ibVar2.f226479b = true;
                C82998if ifVar = (C82998if) C83000ih.f226494e.createBuilder();
                if (m128892e(i, 16)) {
                    i2 = 2;
                } else {
                    i2 = m128892e(i, 8) ? 3 : m128892e(i, 4) ? 4 : m128892e(i, 128) ? 5 : m128892e(i, 64) ? 6 : m128892e(i, 32) ? 7 : 1;
                }
                ifVar.copyOnWrite();
                C83000ih ihVar = (C83000ih) ifVar.instance;
                ihVar.f226497b = i2 - 1;
                ihVar.f226496a |= 1;
                ifVar.copyOnWrite();
                C83000ih ihVar2 = (C83000ih) ifVar.instance;
                ihVar2.f226496a |= 2;
                ihVar2.f226498c = m128892e(i, 1);
                ifVar.copyOnWrite();
                C83000ih ihVar3 = (C83000ih) ifVar.instance;
                ihVar3.f226496a |= 4;
                ihVar3.f226499d = m128892e(i, 2);
                C83000ih ihVar4 = (C83000ih) ifVar.build();
                hzVar.copyOnWrite();
                C82994ib ibVar3 = (C82994ib) hzVar.instance;
                ihVar4.getClass();
                ibVar3.f226481d = ihVar4;
                ibVar3.f226478a |= 4;
                C82995ic icVar = (C82995ic) C82997ie.f226485g.createBuilder();
                String action = intent2.getAction();
                if (action != null) {
                    icVar.copyOnWrite();
                    C82997ie ieVar = (C82997ie) icVar.instance;
                    ieVar.f226487a |= 1;
                    ieVar.f226488b = action;
                }
                String stringExtra2 = intent2.getStringExtra("source");
                if (stringExtra2 != null) {
                    icVar.copyOnWrite();
                    C82997ie ieVar2 = (C82997ie) icVar.instance;
                    ieVar2.f226487a = 2 | ieVar2.f226487a;
                    ieVar2.f226489c = stringExtra2;
                }
                Set<String> categories = intent2.getCategories();
                if (categories != null) {
                    icVar.copyOnWrite();
                    C82997ie ieVar3 = (C82997ie) icVar.instance;
                    C62971cq cqVar = ieVar3.f226490d;
                    if (!cqVar.mo58948c()) {
                        ieVar3.f226490d = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) categories, (List) ieVar3.f226490d);
                }
                String dataString = intent2.getDataString();
                if (dataString != null) {
                    icVar.copyOnWrite();
                    C82997ie ieVar4 = (C82997ie) icVar.instance;
                    ieVar4.f226487a |= 4;
                    ieVar4.f226491e = dataString;
                }
                Bundle extras = intent2.getExtras();
                if (extras != null) {
                    Map b = m128889b(extras);
                    icVar.copyOnWrite();
                    C82997ie ieVar5 = (C82997ie) icVar.instance;
                    C62995dn dnVar = ieVar5.f226492f;
                    if (!dnVar.f170058b) {
                        ieVar5.f226492f = dnVar.mo58980a();
                    }
                    ieVar5.f226492f.putAll(b);
                }
                C82997ie ieVar6 = (C82997ie) icVar.build();
                hzVar.copyOnWrite();
                C82994ib ibVar4 = (C82994ib) hzVar.instance;
                ieVar6.getClass();
                ibVar4.f226483f = ieVar6;
                ibVar4.f226478a |= 8;
                Map b2 = m128889b(bundle);
                hzVar.copyOnWrite();
                C82994ib ibVar5 = (C82994ib) hzVar.instance;
                C62995dn dnVar2 = ibVar5.f226482e;
                if (!dnVar2.f170058b) {
                    ibVar5.f226482e = dnVar2.mo58980a();
                }
                ibVar5.f226482e.putAll(b2);
                m128890c((C82994ib) hzVar.build());
                return true;
            }
        } else {
            hzVar.copyOnWrite();
            C82994ib ibVar6 = (C82994ib) hzVar.instance;
            ibVar6.f226478a |= 2;
            ibVar6.f226480c = true;
            hzVar.copyOnWrite();
            C82994ib ibVar7 = (C82994ib) hzVar.instance;
            ibVar7.f226478a |= 1;
            ibVar7.f226479b = true;
            m128890c((C82994ib) hzVar.build());
            return true;
        }
    }
}
