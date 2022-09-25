package com.google.p4591e.p4592a.p4593a;

import com.evernote.android.state.BuildConfig;
import com.google.p4591e.p4592a.p4603d.p4604a.C61040a;

/* renamed from: com.google.e.a.a.a */
/* compiled from: PG */
public enum C61014a {
    PLUS('+', BuildConfig.FLAVOR, ",", false, true),
    HASH('#', "#", ",", false, true),
    DOT('.', ".", ".", false, false),
    FORWARD_SLASH('/', "/", "/", false, false),
    SEMI_COLON(';', ";", ";", true, false),
    QUERY('?', "?", "&", true, false),
    AMP('&', "&", "&", true, false),
    SIMPLE((String) null, BuildConfig.FLAVOR, ",", false, false);
    

    /* renamed from: i */
    public final Character f165227i;

    /* renamed from: j */
    public final String f165228j;

    /* renamed from: k */
    public final String f165229k;

    /* renamed from: l */
    public final boolean f165230l;

    /* renamed from: m */
    public final boolean f165231m;

    private C61014a(Character ch, String str, String str2, boolean z, boolean z2) {
        this.f165227i = ch;
        this.f165228j = str;
        this.f165229k = str2;
        this.f165230l = z;
        this.f165231m = z2;
        if (ch != null) {
            C61015b.f165232a.put(ch, this);
        }
    }

    /* renamed from: a */
    public final String mo57532a(String str) {
        if (this.f165231m) {
            return C61040a.f165277b.mo57591a(str);
        }
        return C61040a.f165276a.mo57591a(str);
    }
}
