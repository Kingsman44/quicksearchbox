package com.google.android.apps.gsa.search.shared.actions.errors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90453a;

/* compiled from: PG */
public class VoiceSearchError extends SearchError {
    public static final Parcelable.Creator CREATOR = new C87416d();

    /* renamed from: n */
    public final int f236066n;

    /* renamed from: o */
    private final int f236067o;

    /* renamed from: p */
    private final int f236068p;

    /* renamed from: q */
    private final int f236069q;

    /* renamed from: r */
    private final int f236070r;

    /* renamed from: s */
    private final int f236071s;

    protected VoiceSearchError(Parcel parcel) {
        super(parcel);
        this.f236067o = parcel.readInt();
        this.f236068p = parcel.readInt();
        this.f236069q = parcel.readInt();
        this.f236070r = parcel.readInt();
        this.f236071s = parcel.readInt();
        int readInt = parcel.readInt();
        C90453a.m147150a();
        this.f236066n = readInt < 12 ? C90453a.m147150a()[readInt] : 1;
    }

    /* renamed from: S */
    public final int mo81139S() {
        return this.f236067o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f236067o);
        parcel.writeInt(this.f236068p);
        parcel.writeInt(this.f236069q);
        parcel.writeInt(this.f236070r);
        parcel.writeInt(this.f236071s);
        int i2 = this.f236066n;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = com.google.android.googlequicksearchbox.R.string.audio_error;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = com.google.android.googlequicksearchbox.R.string.network_error;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        if (r0 != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VoiceSearchError(com.google.android.apps.gsa.shared.search.Query r10, com.google.android.apps.gsa.shared.speech.p7139a.C90528t r11, java.lang.String r12) {
        /*
            r9 = this;
            boolean r0 = r10.mo84447db()
            boolean r1 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147157g(r11)
            if (r1 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0011
            r0 = 2132088406(0x7f151656, float:1.9817095E38)
            goto L_0x0083
        L_0x0011:
            r0 = 2132090095(0x7f151cef, float:1.982052E38)
            goto L_0x0083
        L_0x0016:
            boolean r1 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147156f(r11)
            if (r1 == 0) goto L_0x0021
            r0 = 2132091064(0x7f1520b8, float:1.9822486E38)
            goto L_0x0083
        L_0x0021:
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90520l
            r2 = 2132088399(0x7f15164f, float:1.981708E38)
            r3 = 2132085244(0x7f1509fc, float:1.9810681E38)
            if (r1 == 0) goto L_0x0035
            if (r0 == 0) goto L_0x0031
        L_0x002d:
            r0 = 2132088399(0x7f15164f, float:1.981708E38)
            goto L_0x0083
        L_0x0031:
            r0 = 2132085244(0x7f1509fc, float:1.9810681E38)
            goto L_0x0083
        L_0x0035:
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90523o
            r4 = 2132088404(0x7f151654, float:1.981709E38)
            r5 = 2132089607(0x7f151b07, float:1.981953E38)
            if (r1 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0045
        L_0x0041:
            r0 = 2132088404(0x7f151654, float:1.981709E38)
            goto L_0x0083
        L_0x0045:
            r0 = 2132089607(0x7f151b07, float:1.981953E38)
            goto L_0x0083
        L_0x0049:
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90527s
            if (r1 == 0) goto L_0x0057
            if (r0 == 0) goto L_0x0053
            r0 = 2132088405(0x7f151655, float:1.9817093E38)
            goto L_0x0083
        L_0x0053:
            r0 = 2132090093(0x7f151ced, float:1.9820516E38)
            goto L_0x0083
        L_0x0057:
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90509a
            if (r1 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x0031
            goto L_0x002d
        L_0x005e:
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90510b
            if (r1 == 0) goto L_0x0065
            if (r0 == 0) goto L_0x0045
            goto L_0x0041
        L_0x0065:
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90512d
            if (r1 != 0) goto L_0x007a
            boolean r1 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90513e
            if (r1 == 0) goto L_0x006e
            goto L_0x007a
        L_0x006e:
            boolean r0 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90529u
            if (r0 == 0) goto L_0x0076
            r0 = 2132093613(0x7f152aad, float:1.9827656E38)
            goto L_0x0083
        L_0x0076:
            r0 = 2132092269(0x7f15256d, float:1.982493E38)
            goto L_0x0083
        L_0x007a:
            if (r0 == 0) goto L_0x0080
            r0 = 2132088407(0x7f151657, float:1.9817097E38)
            goto L_0x0083
        L_0x0080:
            r0 = 2132090291(0x7f151db3, float:1.9820918E38)
        L_0x0083:
            boolean r1 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147157g(r11)
            r2 = 1
            r3 = 0
            if (r2 == r1) goto L_0x008d
            r1 = 0
            goto L_0x0090
        L_0x008d:
            r1 = 2132090097(0x7f151cf1, float:1.9820524E38)
        L_0x0090:
            boolean r4 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147157g(r11)
            if (r2 == r4) goto L_0x0098
            r4 = 0
            goto L_0x009b
        L_0x0098:
            r4 = 2132090096(0x7f151cf0, float:1.9820522E38)
        L_0x009b:
            boolean r5 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90523o
            if (r5 != 0) goto L_0x00a2
            com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147157g(r11)
        L_0x00a2:
            boolean r6 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90510b
            if (r6 != 0) goto L_0x00b5
            boolean r7 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147157g(r11)
            if (r7 == 0) goto L_0x00ad
            goto L_0x00b5
        L_0x00ad:
            boolean r7 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90527s
            if (r7 == 0) goto L_0x00b5
            r7 = 2131233022(0x7f0808fe, float:1.808217E38)
            goto L_0x00b6
        L_0x00b5:
            r7 = 0
        L_0x00b6:
            boolean r8 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147156f(r11)
            if (r2 == r8) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            r3 = 2132091063(0x7f1520b7, float:1.9822484E38)
        L_0x00c0:
            boolean r2 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147157g(r11)
            if (r2 == 0) goto L_0x00c9
            r2 = 10
            goto L_0x0102
        L_0x00c9:
            boolean r2 = com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b.m147156f(r11)
            if (r2 == 0) goto L_0x00d2
            r2 = 8
            goto L_0x0102
        L_0x00d2:
            boolean r2 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90520l
            if (r2 == 0) goto L_0x00d8
            r2 = 6
            goto L_0x0102
        L_0x00d8:
            if (r5 == 0) goto L_0x00dd
            r2 = 9
            goto L_0x0102
        L_0x00dd:
            boolean r2 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90527s
            if (r2 == 0) goto L_0x00e4
            r2 = 11
            goto L_0x0102
        L_0x00e4:
            boolean r2 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90509a
            if (r2 == 0) goto L_0x00ea
            r2 = 2
            goto L_0x0102
        L_0x00ea:
            if (r6 == 0) goto L_0x00ee
            r2 = 3
            goto L_0x0102
        L_0x00ee:
            boolean r2 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90512d
            if (r2 == 0) goto L_0x00f4
            r2 = 4
            goto L_0x0102
        L_0x00f4:
            boolean r2 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90513e
            if (r2 == 0) goto L_0x00fa
            r2 = 7
            goto L_0x0102
        L_0x00fa:
            boolean r2 = r11 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90529u
            if (r2 == 0) goto L_0x0101
            r2 = 12
            goto L_0x0102
        L_0x0101:
            r2 = 5
        L_0x0102:
            r9.<init>(r10, r12, r11)
            r9.f236067o = r0
            r9.f236068p = r1
            r9.f236069q = r4
            r9.f236066n = r2
            r9.f236070r = r7
            r9.f236071s = r3
            r10 = 4
            boolean r10 = r9.mo81138R(r10)
            if (r10 == 0) goto L_0x0120
            long r10 = r9.f236029m
            r0 = 640(0x280, double:3.16E-321)
            long r10 = r10 | r0
            r9.f236029m = r10
        L_0x0120:
            r10 = 8
            boolean r10 = r9.mo81138R(r10)
            if (r10 != 0) goto L_0x0132
            r10 = 16
            boolean r10 = r9.mo81138R(r10)
            if (r10 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            return
        L_0x0132:
            long r10 = r9.f236029m
            r0 = 512(0x200, double:2.53E-321)
            long r10 = r10 ^ r0
            r9.f236029m = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError.<init>(com.google.android.apps.gsa.shared.search.Query, com.google.android.apps.gsa.shared.speech.a.t, java.lang.String):void");
    }
}
