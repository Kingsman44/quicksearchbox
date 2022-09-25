package com.google.android.apps.search.fedora.p10094c.p10095a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10099e.C132773ad;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import com.google.android.apps.search.fedora.p10099e.C132784ao;
import com.google.android.apps.search.fedora.p10099e.C132786aq;
import com.google.android.apps.search.fedora.p10099e.C132787ar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5228m.C67284ao;
import com.google.speech.p5228m.C67336cm;
import com.google.speech.p5228m.C67337cn;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.c.a.b */
/* compiled from: PG */
public final class C132726b implements C132725a {

    /* renamed from: a */
    private static final C59071e f362149a = C59071e.m91332i("com.google.android.apps.search.fedora.c.a.b");

    /* renamed from: b */
    private final Context f362150b;

    /* renamed from: c */
    private final C69464a f362151c;

    /* renamed from: d */
    private final C69464a f362152d;

    public C132726b(Context context, C69464a aVar, C69464a aVar2) {
        this.f362150b = context;
        this.f362151c = aVar;
        this.f362152d = aVar2;
    }

    /* renamed from: c */
    private final C67337cn m215738c(int i) {
        C67337cn cnVar = C67337cn.f183024e;
        try {
            try {
                return (C67337cn) C62942bv.parseFrom((C62942bv) C67337cn.f183024e, this.f362150b.getResources().openRawResource(i), C62921ba.m95368a());
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f362149a.mo56226d()).mo56382g(e)).mo56372aa(39813)).mo56386p("Failed to convert InputStream to PolicyConfig");
                return cnVar;
            }
        } catch (Resources.NotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f362149a.mo56226d()).mo56382g(e2)).mo56372aa(39814)).mo56386p("Policy config not found in res.");
            return cnVar;
        }
    }

    /* renamed from: d */
    private final void m215739d(C67336cm cmVar, C67337cn cnVar) {
        if (cnVar.f183027b != 0) {
            C67337cn cnVar2 = (C67337cn) cmVar.instance;
            if (cnVar2.f183027b != 0) {
                int i = cnVar.f183029d;
                if (i > cnVar2.f183029d) {
                    cmVar.copyOnWrite();
                    C67337cn cnVar3 = (C67337cn) cmVar.instance;
                    cnVar3.f183026a |= 2;
                    cnVar3.f183029d = i;
                    if (cnVar.f183029d > 1512) {
                        ((C59052c) ((C59052c) f362149a.mo56225c()).mo56372aa(39816)).mo56393w("Policy [%d] uses maxTtl > 63 days. Actual: %d. Ignore if this is expected.", cnVar.f183027b, cnVar.f183029d);
                    }
                }
                for (C67284ao aoVar : cnVar.f183028c) {
                    Iterator it = Collections.unmodifiableList(((C67337cn) cmVar.instance).f183028c).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals(((C67284ao) it.next()).f182898a, aoVar.f182898a)) {
                                ((C59052c) ((C59052c) f362149a.mo56225c()).mo56372aa(39815)).mo56389s("Multiple policy features with the same name: [%s]", aoVar.f182898a);
                                ((C133072j) this.f362152d.mo17428b()).mo110963a("Fedora.Policy.NumDuplicateFeatures");
                                break;
                            }
                        } else {
                            cmVar.mo59783a(aoVar);
                            break;
                        }
                    }
                }
                return;
            }
            cmVar.mergeFrom(cnVar);
        }
    }

    /* renamed from: a */
    public final C67337cn mo110895a(C132787ar arVar, C132773ad adVar) {
        C132786aq aqVar = arVar.f362284b;
        if (aqVar == null) {
            aqVar = C132786aq.f362276d;
        }
        if (aqVar.f362280c) {
            C67336cm cmVar = (C67336cm) C67337cn.f183024e.createBuilder();
            m215739d(cmVar, m215738c(R.raw.fedora_policy_config_apk_pb));
            C132784ao aoVar = arVar.f362285c;
            if (aoVar == null) {
                aoVar = C132784ao.f362255t;
            }
            if (aoVar.f362264h) {
                m215739d(cmVar, m215738c(R.raw.fedora_sheldon_policy_config_apk_pb));
            }
            return (C67337cn) cmVar.build();
        }
        C132779aj ajVar = adVar.f362229c;
        if (ajVar == null) {
            ajVar = C132779aj.f362244h;
        }
        String str = ajVar.f362248c;
        C132779aj ajVar2 = adVar.f362229c;
        if (ajVar2 == null) {
            ajVar2 = C132779aj.f362244h;
        }
        C62971cq<String> cqVar = ajVar2.f362249d;
        C67336cm cmVar2 = (C67336cm) C67337cn.f183024e.createBuilder();
        m215739d(cmVar2, mo110896b(str));
        for (String b : cqVar) {
            m215739d(cmVar2, mo110896b(b));
        }
        C67337cn cnVar = (C67337cn) cmVar2.build();
        if (cnVar.f183027b > 0) {
            return cnVar;
        }
        return m215738c(R.raw.fedora_policy_config_apk_pb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C67337cn mo110896b(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C59052c) ((C59052c) f362149a.mo56226d()).mo56372aa(39812)).mo56386p("Policy config not found on disk.");
            return C67337cn.f183024e;
        }
        try {
            return (C67337cn) ((C42813k) this.f362151c.mo17428b()).mo45889c(Uri.parse(str), C42789m.m75558b(C67337cn.f183024e));
        } catch (FileNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f362149a.mo56225c()).mo56382g(e)).mo56372aa(39810)).mo56386p("Policy config file doesn't exist.");
            return C67337cn.f183024e;
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) f362149a.mo56225c()).mo56382g(e2)).mo56372aa(39811)).mo56386p("Failed to read policy config.");
            return C67337cn.f183024e;
        }
    }
}
