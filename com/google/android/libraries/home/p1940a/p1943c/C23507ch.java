package com.google.android.libraries.home.p1940a.p1943c;

import com.google.protobuf.C62995dn;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63063ga;

/* renamed from: com.google.android.libraries.home.a.c.ch */
/* compiled from: PG */
public final class C23507ch extends C23568eo {

    /* renamed from: a */
    public static final C23506cg f64253a = new C23506cg();

    /* renamed from: c */
    private final String f64254c;

    /* renamed from: d */
    private final String f64255d;

    public C23507ch(C63037fb fbVar) {
        super(C23542dp.MEDIA_SET_CAPTION_CONTROL, fbVar, false, true, (String) null, (String) null);
        this.f64254c = true != m43910h() ? "mediaClosedCaptioningOff" : "mediaClosedCaptioningOn";
        this.f64255d = true != m43910h() ? null : "closedCaptioningLanguage";
    }

    /* renamed from: h */
    private final boolean m43910h() {
        if (!this.f64499b.f170146a.containsKey("isOn")) {
            return false;
        }
        C62995dn dnVar = this.f64499b.f170146a;
        if (dnVar.containsKey("isOn")) {
            C63063ga gaVar = (C63063ga) dnVar.get("isOn");
            if (gaVar.f170181a == 4) {
                return ((Boolean) gaVar.f170182b).booleanValue();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final String mo28875c() {
        return this.f64255d;
    }

    /* renamed from: d */
    public final String mo28876d() {
        return this.f64254c;
    }
}
