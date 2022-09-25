package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56540bx;

/* compiled from: PG */
public final class Answer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C43068a();

    /* renamed from: a */
    public C56517ba f112629a;

    /* renamed from: b */
    public String f112630b;

    /* renamed from: c */
    public C56540bx f112631c;

    /* renamed from: d */
    public long f112632d;

    /* renamed from: e */
    public boolean f112633e;

    /* renamed from: f */
    public String f112634f;

    /* renamed from: g */
    public int f112635g;

    public Answer() {
        this.f112629a = C56517ba.f150934d;
        this.f112635g = 1;
        this.f112630b = BuildConfig.FLAVOR;
        this.f112631c = C56540bx.f150983c;
        this.f112632d = 0;
        this.f112633e = false;
        this.f112634f = BuildConfig.FLAVOR;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeByteArray(this.f112629a.toByteArray());
        int i2 = this.f112635g;
        switch (i2) {
            case 1:
                str = "NOT_SET";
                break;
            case 2:
                str = "SURVEY_SHOWN";
                break;
            case 3:
                str = "SURVEY_ACCEPTED";
                break;
            case 4:
                str = "INVITATION_ANSWERED";
                break;
            case 5:
                str = "QUESTION_ANSWERED";
                break;
            case 6:
                str = "SURVEY_CLOSED";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.f112630b);
            parcel.writeByteArray(this.f112631c.toByteArray());
            parcel.writeLong(this.f112632d);
            parcel.writeInt(this.f112633e ? 1 : 0);
            parcel.writeString(this.f112634f);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Answer(android.os.Parcel r9) {
        /*
            r8 = this;
            r8.<init>()
            byte[] r0 = r9.createByteArray()
            android.content.Context r1 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b
            if (r1 == 0) goto L_0x0027
            android.content.Context r1 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b
            boolean r1 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68397v.m98790c(r1)
            boolean r1 = com.google.android.libraries.surveys.internal.p3328e.C43054c.m75959b(r1)
            if (r1 == 0) goto L_0x0027
            if (r0 == 0) goto L_0x0022
            com.google.bu.a.ba r1 = com.google.p4281bu.p4282a.C56517ba.f150934d
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75983d(r1, r0)
            com.google.bu.a.ba r0 = (com.google.p4281bu.p4282a.C56517ba) r0
            goto L_0x0024
        L_0x0022:
            com.google.bu.a.ba r0 = com.google.p4281bu.p4282a.C56517ba.f150934d
        L_0x0024:
            r8.f112629a = r0
            goto L_0x0031
        L_0x0027:
            com.google.bu.a.ba r1 = com.google.p4281bu.p4282a.C56517ba.f150934d
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75983d(r1, r0)
            com.google.bu.a.ba r0 = (com.google.p4281bu.p4282a.C56517ba) r0
            r8.f112629a = r0
        L_0x0031:
            java.lang.String r0 = r9.readString()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r1) {
                case -1446966090: goto L_0x0075;
                case -1226895677: goto L_0x006b;
                case -904377066: goto L_0x0061;
                case -801661455: goto L_0x0057;
                case -541898004: goto L_0x004d;
                case 127344588: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x007f
        L_0x0043:
            java.lang.String r1 = "SURVEY_SHOWN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x004d:
            java.lang.String r1 = "SURVEY_ACCEPTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 2
            goto L_0x0080
        L_0x0057:
            java.lang.String r1 = "SURVEY_CLOSED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 5
            goto L_0x0080
        L_0x0061:
            java.lang.String r1 = "QUESTION_ANSWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 4
            goto L_0x0080
        L_0x006b:
            java.lang.String r1 = "INVITATION_ANSWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 3
            goto L_0x0080
        L_0x0075:
            java.lang.String r1 = "NOT_SET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007f
            r0 = 0
            goto L_0x0080
        L_0x007f:
            r0 = -1
        L_0x0080:
            if (r0 == 0) goto L_0x009a
            if (r0 == r7) goto L_0x0098
            if (r0 == r6) goto L_0x0096
            if (r0 == r5) goto L_0x0094
            if (r0 == r4) goto L_0x009b
            if (r0 != r3) goto L_0x008e
            r3 = 6
            goto L_0x009b
        L_0x008e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L_0x0094:
            r3 = 4
            goto L_0x009b
        L_0x0096:
            r3 = 3
            goto L_0x009b
        L_0x0098:
            r3 = 2
            goto L_0x009b
        L_0x009a:
            r3 = 1
        L_0x009b:
            r8.f112635g = r3
            java.lang.String r0 = r9.readString()
            r8.f112630b = r0
            byte[] r0 = r9.createByteArray()
            if (r0 == 0) goto L_0x00b4
            com.google.bu.a.bx r1 = com.google.p4281bu.p4282a.C56540bx.f150983c
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75983d(r1, r0)
            com.google.bu.a.bx r0 = (com.google.p4281bu.p4282a.C56540bx) r0
            r8.f112631c = r0
            goto L_0x00b8
        L_0x00b4:
            com.google.bu.a.bx r0 = com.google.p4281bu.p4282a.C56540bx.f150983c
            r8.f112631c = r0
        L_0x00b8:
            long r0 = r9.readLong()
            r8.f112632d = r0
            int r0 = r9.readInt()
            if (r0 <= 0) goto L_0x00c5
            r2 = 1
        L_0x00c5:
            r8.f112633e = r2
            java.lang.String r9 = r9.readString()
            r8.f112634f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.model.Answer.<init>(android.os.Parcel):void");
    }
}
