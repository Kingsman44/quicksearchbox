package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78257g;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6178b.C78542a;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58466gb;
import com.google.common.p4522b.C58468gd;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.m */
/* compiled from: PG */
public final class C78510m {

    /* renamed from: a */
    public final C81515c f216221a;

    /* renamed from: b */
    public final C83358h f216222b;

    /* renamed from: c */
    public final C78253d f216223c;

    /* renamed from: d */
    public final C78257g f216224d;

    /* renamed from: e */
    public final C78542a f216225e;

    /* renamed from: f */
    private final C58468gd f216226f;

    public C78510m(C81515c cVar, C83358h hVar, C78253d dVar, C78257g gVar, C78542a aVar) {
        this.f216221a = cVar;
        this.f216222b = hVar;
        this.f216223c = dVar;
        this.f216224d = gVar;
        C58466gb gbVar = new C58466gb();
        gbVar.mo55364d(0, Integer.valueOf(R.string.nga_greeting_default));
        gbVar.mo55364d(1, Integer.valueOf(R.string.privacy_text_v1));
        gbVar.mo55364d(2, Integer.valueOf(R.string.privacy_text_v2));
        gbVar.mo55364d(3, Integer.valueOf(R.string.privacy_text_v3));
        gbVar.mo55364d(4, Integer.valueOf(R.string.privacy_text_v4));
        gbVar.mo55364d(5, Integer.valueOf(R.string.privacy_text_v5));
        gbVar.mo55364d(6, Integer.valueOf(R.string.privacy_text_v6));
        gbVar.mo55364d(7, Integer.valueOf(R.string.privacy_text_v7));
        gbVar.mo55364d(11, Integer.valueOf(R.string.personality_text_v1));
        gbVar.mo55364d(12, Integer.valueOf(R.string.personality_text_v2));
        gbVar.mo55364d(13, Integer.valueOf(R.string.personality_text_v3));
        gbVar.mo55364d(14, Integer.valueOf(R.string.personality_text_v4));
        gbVar.mo55364d(15, Integer.valueOf(R.string.personality_text_v5));
        gbVar.mo55364d(16, Integer.valueOf(R.string.personality_text_v6));
        gbVar.mo55364d(17, Integer.valueOf(R.string.personality_text_v7));
        gbVar.mo55364d(100, Integer.valueOf(R.string.nga_greeting_with_name));
        gbVar.mo55364d(111, Integer.valueOf(R.string.personality_text_with_name_v1));
        gbVar.mo55364d(112, Integer.valueOf(R.string.personality_text_with_name_v2));
        gbVar.mo55364d(113, Integer.valueOf(R.string.personality_text_with_name_v3));
        gbVar.mo55364d(114, Integer.valueOf(R.string.personality_text_with_name_v4));
        gbVar.mo55364d(115, Integer.valueOf(R.string.personality_text_with_name_v5));
        gbVar.mo55364d(116, Integer.valueOf(R.string.personality_text_with_name_v6));
        gbVar.mo55364d(117, Integer.valueOf(R.string.personality_text_with_name_v7));
        this.f216226f = gbVar.mo55363c();
        this.f216225e = aVar;
    }

    /* renamed from: b */
    public static boolean m126108b(int i) {
        return i >= 100;
    }

    /* renamed from: a */
    public final int mo73431a(Integer num) {
        if (!this.f216226f.containsKey(num)) {
            return R.string.nga_greeting_default;
        }
        return ((Integer) this.f216226f.get(num)).intValue();
    }
}
