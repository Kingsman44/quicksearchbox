package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.LruCache;
import androidx.p060c.C0977g;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14192ac;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14194ae;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14196ag;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14197ah;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14200ak;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14201al;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14202am;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14203an;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14204ao;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14205ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14206aq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14207ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14210au;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14220bd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h */
/* compiled from: PG */
public final class C14878h implements C14781a {

    /* renamed from: a */
    public static final C59071e f44766a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.h");

    /* renamed from: b */
    static final String[] f44767b = {"_id", "display_name", "number", "label"};

    /* renamed from: c */
    static final String[] f44768c = {"data1", "data2", "data3"};

    /* renamed from: d */
    public final C0977g f44769d = new C0977g();

    /* renamed from: e */
    public final LruCache f44770e = new LruCache(12);

    /* renamed from: f */
    public final C0977g f44771f = new C0977g();

    /* renamed from: g */
    public final ContentResolver f44772g;

    /* renamed from: h */
    public final Context f44773h;

    /* renamed from: i */
    public final C15388p f44774i;

    /* renamed from: j */
    private final C60887da f44775j;

    /* renamed from: k */
    private final C46877q f44776k;

    public C14878h(Context context, C60887da daVar, C15388p pVar, C46877q qVar) {
        this.f44773h = C39239a.m68666a(context, C39226b.TAG_ASSISTANT_AUTO_TNG_MORRIS);
        this.f44775j = daVar;
        this.f44772g = context.getContentResolver();
        this.f44774i = pVar;
        this.f44776k = qVar;
    }

    /* renamed from: f */
    private final C60870cx m31297f(String str) {
        return this.f44776k.mo50872b(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), f44767b, (String) null, (String[]) null, (String) null).f121591a.mo57272e(C47810es.m84970j(C14876f.f44764a), this.f44775j).mo57275g();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21504d() {
    }

    /* renamed from: e */
    public final void mo21505e() {
        this.f44769d.clear();
        this.f44770e.evictAll();
        this.f44771f.clear();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14200ak akVar;
        C14192ac acVar;
        C14196ag agVar;
        C14194ae aeVar;
        if (C14218bb.m30579a(bcVar.f43038a) == C14218bb.CONTACT_DATA_REQUEST) {
            if (bcVar.f43038a == 25) {
                akVar = (C14200ak) bcVar.f43039b;
            } else {
                akVar = C14200ak.f42978c;
            }
            int i = akVar.f42980a;
            int b = C14197ah.m30575b(i);
            int i2 = b - 1;
            if (b == 0) {
                throw null;
            } else if (i2 == 0) {
                if (i == 1) {
                    acVar = (C14192ac) akVar.f42981b;
                } else {
                    acVar = C14192ac.f42967b;
                }
                String str = (String) this.f44769d.get(acVar.f42969a);
                if (str != null) {
                    C14220bd bdVar = (C14220bd) C14221be.f43041c.createBuilder();
                    C14201al alVar = (C14201al) C14210au.f42993c.createBuilder();
                    C14202am amVar = (C14202am) C14203an.f42982b.createBuilder();
                    amVar.copyOnWrite();
                    ((C14203an) amVar.instance).f42984a = str;
                    alVar.copyOnWrite();
                    C14210au auVar = (C14210au) alVar.instance;
                    C14203an anVar = (C14203an) amVar.build();
                    anVar.getClass();
                    auVar.f42996b = anVar;
                    auVar.f42995a = 1;
                    bdVar.copyOnWrite();
                    C14221be beVar = (C14221be) bdVar.instance;
                    C14210au auVar2 = (C14210au) alVar.build();
                    auVar2.getClass();
                    beVar.f43044b = auVar2;
                    beVar.f43043a = 15;
                    return (C14221be) bdVar.build();
                }
                C59104x c = f44766a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                ((C59052c) ((C59052c) c).mo56372aa(45498)).mo56386p("Error getting contact name: cache miss");
            } else if (i2 == 1) {
                if (i == 2) {
                    agVar = (C14196ag) akVar.f42981b;
                } else {
                    agVar = C14196ag.f42973b;
                }
                C14361gj gjVar = (C14361gj) this.f44770e.get(agVar.f42975a);
                if (gjVar != null) {
                    C14220bd bdVar2 = (C14220bd) C14221be.f43041c.createBuilder();
                    C14201al alVar2 = (C14201al) C14210au.f42993c.createBuilder();
                    C14206aq aqVar = (C14206aq) C14207ar.f42988b.createBuilder();
                    aqVar.copyOnWrite();
                    ((C14207ar) aqVar.instance).f42990a = gjVar;
                    alVar2.copyOnWrite();
                    C14210au auVar3 = (C14210au) alVar2.instance;
                    C14207ar arVar = (C14207ar) aqVar.build();
                    arVar.getClass();
                    auVar3.f42996b = arVar;
                    auVar3.f42995a = 2;
                    bdVar2.copyOnWrite();
                    C14221be beVar2 = (C14221be) bdVar2.instance;
                    C14210au auVar4 = (C14210au) alVar2.build();
                    auVar4.getClass();
                    beVar2.f43044b = auVar4;
                    beVar2.f43043a = 15;
                    return (C14221be) bdVar2.build();
                }
                C59104x c2 = f44766a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                ((C59052c) ((C59052c) c2).mo56372aa(45499)).mo56386p("Error getting contact photo: cache miss");
            } else if (i2 != 3) {
                C59104x d = f44766a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(45497);
                int b2 = C14197ah.m30575b(akVar.f42980a);
                String a = C14197ah.m30574a(b2);
                if (b2 != 0) {
                    cVar.mo56389s("Unknown contact request type: %s", a);
                } else {
                    throw null;
                }
            } else {
                if (i == 4) {
                    aeVar = (C14194ae) akVar.f42981b;
                } else {
                    aeVar = C14194ae.f42970b;
                }
                List list = (List) this.f44771f.get(Long.valueOf(aeVar.f42972a));
                if (list != null) {
                    C14220bd bdVar3 = (C14220bd) C14221be.f43041c.createBuilder();
                    C14201al alVar3 = (C14201al) C14210au.f42993c.createBuilder();
                    C14204ao aoVar = (C14204ao) C14205ap.f42985b.createBuilder();
                    aoVar.copyOnWrite();
                    C14205ap apVar = (C14205ap) aoVar.instance;
                    C62971cq cqVar = apVar.f42987a;
                    if (!cqVar.mo58948c()) {
                        apVar.f42987a = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) list, (List) apVar.f42987a);
                    alVar3.copyOnWrite();
                    C14210au auVar5 = (C14210au) alVar3.instance;
                    C14205ap apVar2 = (C14205ap) aoVar.build();
                    apVar2.getClass();
                    auVar5.f42996b = apVar2;
                    auVar5.f42995a = 4;
                    bdVar3.copyOnWrite();
                    C14221be beVar3 = (C14221be) bdVar3.instance;
                    C14210au auVar6 = (C14210au) alVar3.build();
                    auVar6.getClass();
                    beVar3.f43044b = auVar6;
                    beVar3.f43043a = 15;
                    return (C14221be) bdVar3.build();
                }
                C59104x c3 = f44766a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
                ((C59052c) ((C59052c) c3).mo56372aa(45500)).mo56386p("Error getting contact phone number: cache miss");
            }
        } else {
            C59104x d2 = f44766a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
            ((C59052c) ((C59052c) d2).mo56372aa(45496)).mo56389s("Unknown request type: %s", C14218bb.m30579a(bcVar.f43038a).name());
        }
        return C14221be.f43041c;
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14200ak akVar;
        C14192ac acVar;
        C14196ag agVar;
        C14194ae aeVar;
        if (C14218bb.m30579a(bcVar.f43038a) != C14218bb.CONTACT_DATA_REQUEST) {
            return C60856cj.m92900i(C14782b.FAILED);
        }
        if (bcVar.f43038a == 25) {
            akVar = (C14200ak) bcVar.f43039b;
        } else {
            akVar = C14200ak.f42978c;
        }
        int i = akVar.f42980a;
        int b = C14197ah.m30575b(i);
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                acVar = (C14192ac) akVar.f42981b;
            } else {
                acVar = C14192ac.f42967b;
            }
            String str = acVar.f42969a;
            if (((String) this.f44769d.get(str)) != null) {
                return C60856cj.m92900i(C14782b.SUCCESS);
            }
            this.f44769d.put(str, BuildConfig.FLAVOR);
            C58976aa aaVar = C58975e.f156826a;
            return C60922j.m93044g(m31297f(str), C47810es.m84963c(new C14875e(this, str)), this.f44775j);
        } else if (i2 == 1) {
            if (i == 2) {
                agVar = (C14196ag) akVar.f42981b;
            } else {
                agVar = C14196ag.f42973b;
            }
            String str2 = agVar.f42975a;
            if (((C14361gj) this.f44770e.get(str2)) != null) {
                return C60856cj.m92900i(C14782b.SUCCESS);
            }
            this.f44770e.put(str2, C14361gj.f43456e);
            C58976aa aaVar2 = C58975e.f156826a;
            return C60922j.m93044g(m31297f(str2), C47810es.m84963c(new C14866d(this, str2)), this.f44775j);
        } else if (i2 != 3) {
            C59104x d = f44766a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.ContactDataSrc");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(45505);
            int b2 = C14197ah.m30575b(akVar.f42980a);
            String a = C14197ah.m30574a(b2);
            if (b2 != 0) {
                cVar.mo56389s("Unknown contact request type: %s", a);
                return C60856cj.m92900i(C14782b.FAILED);
            }
            throw null;
        } else {
            if (i == 4) {
                aeVar = (C14194ae) akVar.f42981b;
            } else {
                aeVar = C14194ae.f42970b;
            }
            long j = aeVar.f42972a;
            C0977g gVar = this.f44771f;
            Long valueOf = Long.valueOf(j);
            if (((List) gVar.get(valueOf)) != null) {
                return C60856cj.m92900i(C14782b.SUCCESS);
            }
            this.f44771f.put(valueOf, C58485gu.m89845m());
            return C60922j.m93044g(this.f44776k.mo50872b(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f44768c, "contact_id = ?", new String[]{Long.toString(j)}, (String) null).f121591a.mo57272e(C47810es.m84970j(C14877g.f44765a), this.f44775j).mo57275g(), C47810es.m84963c(new C14839c(this, j)), this.f44775j);
        }
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
    }
}
