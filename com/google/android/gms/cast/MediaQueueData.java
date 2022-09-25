package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143365aw();

    /* renamed from: a */
    public String f388680a;

    /* renamed from: b */
    public String f388681b;

    /* renamed from: c */
    public int f388682c;

    /* renamed from: d */
    public String f388683d;

    /* renamed from: e */
    public MediaQueueContainerMetadata f388684e;

    /* renamed from: f */
    public int f388685f;

    /* renamed from: g */
    public int f388686g;

    /* renamed from: h */
    public long f388687h;

    /* renamed from: i */
    public boolean f388688i;

    /* renamed from: j */
    private List f388689j;

    public MediaQueueData() {
        m232571b();
    }

    public MediaQueueData(MediaQueueData mediaQueueData) {
        this.f388680a = mediaQueueData.f388680a;
        this.f388681b = mediaQueueData.f388681b;
        this.f388682c = mediaQueueData.f388682c;
        this.f388683d = mediaQueueData.f388683d;
        this.f388684e = mediaQueueData.f388684e;
        this.f388685f = mediaQueueData.f388685f;
        this.f388689j = mediaQueueData.f388689j;
        this.f388686g = mediaQueueData.f388686g;
        this.f388687h = mediaQueueData.f388687h;
        this.f388688i = mediaQueueData.f388688i;
    }

    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List list, int i3, long j, boolean z) {
        this.f388680a = str;
        this.f388681b = str2;
        this.f388682c = i;
        this.f388683d = str3;
        this.f388684e = mediaQueueContainerMetadata;
        this.f388685f = i2;
        this.f388689j = list;
        this.f388686g = i3;
        this.f388687h = j;
        this.f388688i = z;
    }

    /* renamed from: b */
    private final void m232571b() {
        this.f388680a = null;
        this.f388681b = null;
        this.f388682c = 0;
        this.f388683d = null;
        this.f388685f = 0;
        this.f388689j = null;
        this.f388686g = 0;
        this.f388687h = -1;
        this.f388688i = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118426a(org.json.JSONObject r13) {
        /*
            r12 = this;
            r12.m232571b()
            if (r13 != 0) goto L_0x0006
            return
        L_0x0006:
            java.lang.String r0 = "id"
            java.lang.String r0 = com.google.android.gms.cast.internal.C143596v.m233273f(r13, r0)
            r12.f388680a = r0
            java.lang.String r0 = "entity"
            java.lang.String r0 = com.google.android.gms.cast.internal.C143596v.m233273f(r13, r0)
            r12.f388681b = r0
            java.lang.String r0 = "queueType"
            java.lang.String r0 = r13.optString(r0)
            int r1 = r0.hashCode()
            r2 = 7
            r3 = 6
            r4 = 8
            r5 = 5
            r6 = 2
            r7 = 3
            r8 = 4
            r9 = -1
            r10 = 0
            r11 = 1
            switch(r1) {
                case -1803151310: goto L_0x0080;
                case -1758903120: goto L_0x0076;
                case -1632865838: goto L_0x006c;
                case -1319760993: goto L_0x0062;
                case -1088524588: goto L_0x0058;
                case 62359119: goto L_0x004e;
                case 73549584: goto L_0x0043;
                case 393100598: goto L_0x0039;
                case 902303413: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x008a
        L_0x002f:
            java.lang.String r1 = "LIVE_TV"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 7
            goto L_0x008b
        L_0x0039:
            java.lang.String r1 = "VIDEO_PLAYLIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 6
            goto L_0x008b
        L_0x0043:
            java.lang.String r1 = "MOVIE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 8
            goto L_0x008b
        L_0x004e:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 0
            goto L_0x008b
        L_0x0058:
            java.lang.String r1 = "TV_SERIES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 5
            goto L_0x008b
        L_0x0062:
            java.lang.String r1 = "AUDIOBOOK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 2
            goto L_0x008b
        L_0x006c:
            java.lang.String r1 = "PLAYLIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 1
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "RADIO_STATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 3
            goto L_0x008b
        L_0x0080:
            java.lang.String r1 = "PODCAST_SERIES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 4
            goto L_0x008b
        L_0x008a:
            r0 = -1
        L_0x008b:
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00a0;
                case 4: goto L_0x009d;
                case 5: goto L_0x009a;
                case 6: goto L_0x0097;
                case 7: goto L_0x0094;
                case 8: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x00ab
        L_0x008f:
            r0 = 9
            r12.f388682c = r0
            goto L_0x00ab
        L_0x0094:
            r12.f388682c = r4
            goto L_0x00ab
        L_0x0097:
            r12.f388682c = r2
            goto L_0x00ab
        L_0x009a:
            r12.f388682c = r3
            goto L_0x00ab
        L_0x009d:
            r12.f388682c = r5
            goto L_0x00ab
        L_0x00a0:
            r12.f388682c = r8
            goto L_0x00ab
        L_0x00a3:
            r12.f388682c = r7
            goto L_0x00ab
        L_0x00a6:
            r12.f388682c = r6
            goto L_0x00ab
        L_0x00a9:
            r12.f388682c = r11
        L_0x00ab:
            java.lang.String r0 = "name"
            java.lang.String r0 = com.google.android.gms.cast.internal.C143596v.m233273f(r13, r0)
            r12.f388683d = r0
            java.lang.String r0 = "containerMetadata"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c0
            org.json.JSONObject r0 = r13.optJSONObject(r0)
            goto L_0x00c1
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            if (r0 == 0) goto L_0x0158
            com.google.android.gms.cast.MediaQueueContainerMetadata r1 = new com.google.android.gms.cast.MediaQueueContainerMetadata
            r1.<init>()
            r1.mo118422a()
            java.lang.String r2 = "containerType"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.optString(r2, r3)
            int r3 = r2.hashCode()
            r4 = 6924225(0x69a7c1, float:9.702906E-39)
            if (r3 == r4) goto L_0x00ec
            r4 = 828666841(0x316473d9, float:3.3244218E-9)
            if (r3 == r4) goto L_0x00e2
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r3 = "GENERIC_CONTAINER"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00f5
            r9 = 0
            goto L_0x00f5
        L_0x00ec:
            java.lang.String r3 = "AUDIOBOOK_CONTAINER"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00f5
            r9 = 1
        L_0x00f5:
            if (r9 == 0) goto L_0x00fd
            if (r9 == r11) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            r1.f388675a = r11
            goto L_0x00ff
        L_0x00fd:
            r1.f388675a = r10
        L_0x00ff:
            java.lang.String r2 = "title"
            java.lang.String r2 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r2)
            r1.f388676b = r2
            java.lang.String r2 = "sections"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            if (r2 == 0) goto L_0x0133
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f388677c = r3
            java.util.List r3 = r1.f388677c
            r4 = 0
        L_0x0119:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x0133
            org.json.JSONObject r5 = r2.optJSONObject(r4)
            if (r5 == 0) goto L_0x0130
            com.google.android.gms.cast.MediaMetadata r6 = new com.google.android.gms.cast.MediaMetadata
            r6.<init>(r10)
            r6.mo118416c(r5)
            r3.add(r6)
        L_0x0130:
            int r4 = r4 + 1
            goto L_0x0119
        L_0x0133:
            java.lang.String r2 = "containerImages"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            if (r2 == 0) goto L_0x0147
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f388678d = r3
            java.util.List r3 = r1.f388678d
            com.google.android.gms.cast.internal.p10776a.C143561b.m233155c(r3, r2)
        L_0x0147:
            java.lang.String r2 = "containerDuration"
            double r3 = r1.f388679e
            double r2 = r0.optDouble(r2, r3)
            r1.f388679e = r2
            com.google.android.gms.cast.MediaQueueContainerMetadata r0 = new com.google.android.gms.cast.MediaQueueContainerMetadata
            r0.<init>(r1)
            r12.f388684e = r0
        L_0x0158:
            java.lang.String r0 = "repeatMode"
            java.lang.String r0 = r13.optString(r0)
            java.lang.Integer r0 = com.google.android.gms.cast.internal.p10776a.C143560a.m233151a(r0)
            if (r0 == 0) goto L_0x016a
            int r0 = r0.intValue()
            r12.f388685f = r0
        L_0x016a:
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r13.optJSONArray(r0)
            if (r0 == 0) goto L_0x0190
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r12.f388689j = r1
        L_0x0179:
            int r2 = r0.length()
            if (r10 >= r2) goto L_0x0190
            org.json.JSONObject r2 = r0.optJSONObject(r10)
            if (r2 == 0) goto L_0x018d
            com.google.android.gms.cast.MediaQueueItem r3 = new com.google.android.gms.cast.MediaQueueItem     // Catch:{ JSONException -> 0x018d }
            r3.<init>((org.json.JSONObject) r2)     // Catch:{ JSONException -> 0x018d }
            r1.add(r3)     // Catch:{ JSONException -> 0x018d }
        L_0x018d:
            int r10 = r10 + 1
            goto L_0x0179
        L_0x0190:
            java.lang.String r0 = "startIndex"
            int r1 = r12.f388686g
            int r0 = r13.optInt(r0, r1)
            r12.f388686g = r0
            java.lang.String r0 = "startTime"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x01af
            long r1 = r12.f388687h
            double r1 = (double) r1
            double r0 = r13.optDouble(r0, r1)
            long r0 = com.google.android.gms.cast.internal.C143596v.m233269b(r0)
            r12.f388687h = r0
        L_0x01af:
            java.lang.String r0 = "shuffle"
            boolean r13 = r13.optBoolean(r0)
            r12.f388688i = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaQueueData.mo118426a(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.f388680a, mediaQueueData.f388680a) && TextUtils.equals(this.f388681b, mediaQueueData.f388681b) && this.f388682c == mediaQueueData.f388682c && TextUtils.equals(this.f388683d, mediaQueueData.f388683d) && C143912ba.m233950b(this.f388684e, mediaQueueData.f388684e) && this.f388685f == mediaQueueData.f388685f && C143912ba.m233950b(this.f388689j, mediaQueueData.f388689j) && this.f388686g == mediaQueueData.f388686g && this.f388687h == mediaQueueData.f388687h && this.f388688i == mediaQueueData.f388688i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388680a, this.f388681b, Integer.valueOf(this.f388682c), this.f388683d, this.f388684e, Integer.valueOf(this.f388685f), this.f388689j, Integer.valueOf(this.f388686g), Long.valueOf(this.f388687h), Boolean.valueOf(this.f388688i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388680a);
        C143947c.m234106y(parcel, 3, this.f388681b);
        C143947c.m234089h(parcel, 4, this.f388682c);
        C143947c.m234106y(parcel, 5, this.f388683d);
        C143947c.m234105x(parcel, 6, this.f388684e, i);
        C143947c.m234089h(parcel, 7, this.f388685f);
        List list2 = this.f388689j;
        if (list2 == null) {
            list = null;
        } else {
            list = Collections.unmodifiableList(list2);
        }
        C143947c.m234080C(parcel, 8, list);
        C143947c.m234089h(parcel, 9, this.f388686g);
        C143947c.m234090i(parcel, 10, this.f388687h);
        C143947c.m234084c(parcel, 11, this.f388688i);
        C143947c.m234083b(parcel, a);
    }
}
