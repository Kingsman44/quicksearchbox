package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import android.graphics.Rect;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* compiled from: PG */
final class AutoValue_VisualElementBoundsParcelable extends VisualElementBoundsParcelable {

    /* renamed from: a */
    private final C8178yk f256171a;

    /* renamed from: b */
    private final Rect f256172b;

    /* renamed from: c */
    private final C57057b f256173c;

    /* renamed from: d */
    private final C7669fo f256174d;

    /* renamed from: e */
    private final C7973qv f256175e;

    public AutoValue_VisualElementBoundsParcelable(C8178yk ykVar, Rect rect, C57057b bVar, C7669fo foVar, C7973qv qvVar) {
        this.f256171a = ykVar;
        this.f256172b = rect;
        this.f256173c = bVar;
        this.f256174d = foVar;
        this.f256175e = qvVar;
    }

    /* renamed from: a */
    public final Rect mo86361a() {
        return this.f256172b;
    }

    /* renamed from: b */
    public final C7669fo mo86362b() {
        return this.f256174d;
    }

    /* renamed from: c */
    public final C7973qv mo86363c() {
        return this.f256175e;
    }

    /* renamed from: d */
    public final C8178yk mo86364d() {
        return this.f256171a;
    }

    /* renamed from: e */
    public final C57057b mo86365e() {
        return this.f256173c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f256174d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r1 = r4.f256175e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f256173c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable
            r2 = 0
            if (r1 == 0) goto L_0x0064
            com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable r5 = (com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable) r5
            com.google.ai.b.yk r1 = r4.f256171a
            com.google.ai.b.yk r3 = r5.mo86364d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            android.graphics.Rect r1 = r4.f256172b
            android.graphics.Rect r3 = r5.mo86361a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
            com.google.bv.e.b.b r1 = r4.f256173c
            if (r1 != 0) goto L_0x002e
            com.google.bv.e.b.b r1 = r5.mo86365e()
            if (r1 != 0) goto L_0x0064
            goto L_0x0038
        L_0x002e:
            com.google.bv.e.b.b r3 = r5.mo86365e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
        L_0x0038:
            com.google.ai.b.fo r1 = r4.f256174d
            if (r1 != 0) goto L_0x0043
            com.google.ai.b.fo r1 = r5.mo86362b()
            if (r1 != 0) goto L_0x0064
            goto L_0x004d
        L_0x0043:
            com.google.ai.b.fo r3 = r5.mo86362b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0064
        L_0x004d:
            com.google.ai.b.qv r1 = r4.f256175e
            if (r1 != 0) goto L_0x0058
            com.google.ai.b.qv r5 = r5.mo86363c()
            if (r5 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0058:
            com.google.ai.b.qv r5 = r5.mo86363c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            return r0
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.AutoValue_VisualElementBoundsParcelable.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.f256171a.hashCode() ^ 1000003) * 1000003) ^ this.f256172b.hashCode()) * 1000003;
        C57057b bVar = this.f256173c;
        int i3 = 0;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C7669fo foVar = this.f256174d;
        if (foVar == null) {
            i2 = 0;
        } else {
            i2 = foVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C7973qv qvVar = this.f256175e;
        if (qvVar != null) {
            i3 = qvVar.hashCode();
        }
        return i5 ^ i3;
    }

    public final String toString() {
        String obj = this.f256171a.toString();
        String obj2 = this.f256172b.toString();
        String valueOf = String.valueOf(this.f256173c);
        String valueOf2 = String.valueOf(this.f256174d);
        String valueOf3 = String.valueOf(this.f256175e);
        return "VisualElementBoundsParcelable{visualElementInfo=" + obj + ", bounds=" + obj2 + ", clearcutAppData=" + valueOf + ", contentId=" + valueOf2 + ", semanticProperties=" + valueOf3 + "}";
    }
}
