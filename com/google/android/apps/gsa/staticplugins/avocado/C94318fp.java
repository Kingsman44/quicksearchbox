package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.p7388al.C93949w;
import com.google.assistant.p3861at.C49879cj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fp */
/* compiled from: PG */
public final class C94318fp extends C83869ac {

    /* renamed from: a */
    public static final C59071e f263554a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.fp");

    /* renamed from: b */
    public final C94299ex f263555b;

    /* renamed from: c */
    public int f263556c = 1;

    /* renamed from: d */
    private final Bundle f263557d;

    /* renamed from: e */
    private final C94316fn f263558e;

    /* renamed from: f */
    private final C68214a f263559f;

    /* renamed from: g */
    private List f263560g;

    /* renamed from: h */
    private final C93949w f263561h;

    public C94318fp(Bundle bundle, C93949w wVar, C94316fn fnVar, C94299ex exVar, C68214a aVar) {
        this.f263557d = bundle;
        this.f263561h = wVar;
        this.f263558e = fnVar;
        this.f263555b = exVar;
        this.f263559f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        this.f263555b.f263511d = true;
        C94316fn fnVar = this.f263558e;
        List list = this.f263560g;
        Bundle bundle = new Bundle();
        ProtoParsers.m95533p(bundle, "VoiceMatchEnrollList", list);
        return C83875ai.m133541f(fnVar, bundle, new C94317fo(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        List<C49879cj> list;
        if (this.f263557d.containsKey("VoiceMatchEnabledList")) {
            list = ProtoParsers.m95529l(this.f263557d, "VoiceMatchEnabledList", C49879cj.f129628l, C62921ba.m95368a());
        } else {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C49879cj cjVar : list) {
            hashSet.add(cjVar.f129631b);
        }
        for (C83917d dVar : this.f263561h.f262367a.f262354z.f228573b) {
            if (!hashSet.contains(dVar.f228555b)) {
                C58976aa aaVar = C58975e.f156826a;
                String str = dVar.f228558e;
                arrayList.add(dVar);
            }
        }
        this.f263560g = arrayList;
        if (!arrayList.isEmpty()) {
            return true;
        }
        ((C89859i) this.f263559f.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_VM_ALREADY_ENROLLED);
        return false;
    }
}
