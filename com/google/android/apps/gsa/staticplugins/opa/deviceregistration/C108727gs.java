package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gs */
/* compiled from: PG */
abstract class C108727gs {
    /* renamed from: c */
    public static C108727gs m180835c(int i, String str) {
        String str2;
        C108745m mVar = new C108745m();
        mVar.mo97084a(R.drawable.quantum_ic_playlist_add_check_googblue_24);
        if (str != null) {
            mVar.f302423b = str;
            mVar.mo97084a(i);
            if (mVar.f302424c == 1 && (str2 = mVar.f302423b) != null) {
                return new C108746n(mVar.f302422a, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (mVar.f302424c == 0) {
                sb.append(" iconResId");
            }
            if (mVar.f302423b == null) {
                sb.append(" topicText");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null topicText");
    }

    /* renamed from: a */
    public abstract int mo97085a();

    /* renamed from: b */
    public abstract String mo97086b();
}
