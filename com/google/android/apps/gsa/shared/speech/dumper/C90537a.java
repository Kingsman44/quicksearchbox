package com.google.android.apps.gsa.shared.speech.dumper;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.a */
/* compiled from: PG */
final class C90537a extends C90550c {

    /* renamed from: a */
    public String f253120a;

    /* renamed from: b */
    public int f253121b;

    /* renamed from: a */
    public final EventForDump mo84659a() {
        String str;
        int i = this.f253121b;
        if (i != 0 && (str = this.f253120a) != null) {
            return new AutoValue_EventForDump(i, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f253121b == 0) {
            sb.append(" caller");
        }
        if (this.f253120a == null) {
            sb.append(" tag");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
