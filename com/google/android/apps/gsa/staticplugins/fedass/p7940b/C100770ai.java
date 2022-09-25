package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132817y;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.ai */
/* compiled from: PG */
public final class C100770ai {

    /* renamed from: a */
    private static final C59071e f281672a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.b.ai");

    /* renamed from: b */
    private final Context f281673b;

    /* renamed from: c */
    private final C69464a f281674c;

    /* renamed from: d */
    private final C69464a f281675d;

    public C100770ai(Context context, C69464a aVar, C69464a aVar2) {
        this.f281673b = context;
        this.f281674c = aVar;
        this.f281675d = aVar2;
    }

    /* renamed from: c */
    private final C67337cn m166970c(int i) {
        C67337cn cnVar = C67337cn.f183024e;
        try {
            try {
                return (C67337cn) C62942bv.parseFrom((C62942bv) C67337cn.f183024e, this.f281673b.getResources().openRawResource(i), C62921ba.m95368a());
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f281672a.mo56226d()).mo56382g(e)).mo56372aa(19556)).mo56386p("Failed to convert InputStream to PolicyConfig");
                return cnVar;
            }
        } catch (Resources.NotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f281672a.mo56226d()).mo56382g(e2)).mo56372aa(19557)).mo56386p("Policy config not found in res.");
            return cnVar;
        }
    }

    /* renamed from: d */
    private final void m166971d(C67336cm cmVar, C67337cn cnVar) {
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
                        ((C59052c) ((C59052c) f281672a.mo56225c()).mo56372aa(19559)).mo56393w("Policy [%d] uses maxTtl > 63 days. Actual: %d. Ignore if this is expected.", cnVar.f183027b, cnVar.f183029d);
                    }
                }
                for (C67284ao aoVar : cnVar.f183028c) {
                    Iterator it = Collections.unmodifiableList(((C67337cn) cmVar.instance).f183028c).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals(((C67284ao) it.next()).f182898a, aoVar.f182898a)) {
                                ((C59052c) ((C59052c) f281672a.mo56225c()).mo56372aa(19558)).mo56389s("Multiple policy features with the same name: [%s]", aoVar.f182898a);
                                ((C19435g) this.f281675d.mo17428b()).mo24619a("FedAss.Policy.NumDuplicateFeatures");
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
    public final C67337cn mo92043a(C132800h hVar) {
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132817y yVar = zVar.f362396b;
        if (yVar == null) {
            yVar = C132817y.f362388d;
        }
        if (yVar.f362392c) {
            C67336cm cmVar = (C67336cm) C67337cn.f183024e.createBuilder();
            m166971d(cmVar, m166970c(R.raw.training_cache_policy_config_pb));
            C132818z zVar2 = hVar.f362336d;
            if (zVar2 == null) {
                zVar2 = C132818z.f362393h;
            }
            C132815w wVar = zVar2.f362397c;
            if (wVar == null) {
                wVar = C132815w.f362363x;
            }
            if (wVar.f362373i) {
                m166971d(cmVar, m166970c(R.raw.training_cache_policy_config_sheldon_pb));
            }
            return (C67337cn) cmVar.build();
        }
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        String str = fVar.f362321e;
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        C62971cq<String> cqVar = fVar2.f362322f;
        C67336cm cmVar2 = (C67336cm) C67337cn.f183024e.createBuilder();
        m166971d(cmVar2, mo92044b(str));
        for (String b : cqVar) {
            m166971d(cmVar2, mo92044b(b));
        }
        C67337cn cnVar = (C67337cn) cmVar2.build();
        if (cnVar.f183027b > 0) {
            return cnVar;
        }
        return m166970c(R.raw.training_cache_policy_config_pb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C67337cn mo92044b(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C59052c) ((C59052c) f281672a.mo56226d()).mo56372aa(19555)).mo56386p("Policy config not found on disk.");
            return C67337cn.f183024e;
        }
        try {
            return (C67337cn) ((C42813k) this.f281674c.mo17428b()).mo45889c(Uri.parse(str), C42789m.m75558b(C67337cn.f183024e));
        } catch (FileNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f281672a.mo56225c()).mo56382g(e)).mo56372aa(19553)).mo56386p("Policy config file doesn't exist.");
            return C67337cn.f183024e;
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) f281672a.mo56225c()).mo56382g(e2)).mo56372aa(19554)).mo56386p("Failed to read policy config.");
            return C67337cn.f183024e;
        }
    }
}
