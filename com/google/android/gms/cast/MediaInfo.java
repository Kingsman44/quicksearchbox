package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C143358ap();

    /* renamed from: a */
    public String f388634a;

    /* renamed from: b */
    public int f388635b;

    /* renamed from: c */
    public String f388636c;

    /* renamed from: d */
    public MediaMetadata f388637d;

    /* renamed from: e */
    public long f388638e;

    /* renamed from: f */
    public List f388639f;

    /* renamed from: g */
    public TextTrackStyle f388640g;

    /* renamed from: h */
    String f388641h;

    /* renamed from: i */
    public List f388642i;

    /* renamed from: j */
    public List f388643j;

    /* renamed from: k */
    public String f388644k;

    /* renamed from: l */
    public VastAdsRequest f388645l;

    /* renamed from: m */
    public long f388646m;

    /* renamed from: n */
    public String f388647n;

    /* renamed from: o */
    public String f388648o;

    /* renamed from: p */
    public String f388649p;

    /* renamed from: q */
    public String f388650q;

    /* renamed from: r */
    public JSONObject f388651r;

    static {
        Pattern pattern = C143596v.f389362a;
    }

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List list, TextTrackStyle textTrackStyle, String str3, List list2, List list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        String str9 = str3;
        String str10 = str4;
        String str11 = str6;
        this.f388634a = str;
        this.f388635b = i;
        this.f388636c = str2;
        this.f388637d = mediaMetadata;
        this.f388638e = j;
        this.f388639f = list;
        this.f388640g = textTrackStyle;
        this.f388641h = str9;
        if (str9 != null) {
            try {
                this.f388651r = new JSONObject(this.f388641h);
            } catch (JSONException unused) {
                this.f388651r = null;
                this.f388641h = null;
            }
        } else {
            this.f388651r = null;
        }
        this.f388642i = list2;
        this.f388643j = list3;
        this.f388644k = str10;
        this.f388645l = vastAdsRequest;
        this.f388646m = j2;
        this.f388647n = str5;
        this.f388648o = str11;
        this.f388649p = str7;
        this.f388650q = str8;
        if (this.f388634a == null && str11 == null && str10 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    /* renamed from: a */
    public final String mo118403a() {
        String str = this.f388634a;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8 A[LOOP:0: B:3:0x0022->B:23:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0183 A[LOOP:2: B:29:0x00cf->B:55:0x0183, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118404b(org.json.JSONObject r40) {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            java.lang.String r3 = "whenSkippable"
            java.lang.String r0 = "breaks"
            boolean r4 = r2.has(r0)
            java.lang.String r5 = "duration"
            java.lang.String r6 = "id"
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x00b9
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r4.length()
            r10.<init>(r0)
            r11 = 0
        L_0x0022:
            int r0 = r4.length()
            if (r11 >= r0) goto L_0x00b2
            org.json.JSONObject r0 = r4.getJSONObject(r11)
            if (r0 != 0) goto L_0x0031
        L_0x002e:
            r0 = 0
            goto L_0x00a6
        L_0x0031:
            boolean r12 = r0.has(r6)
            if (r12 == 0) goto L_0x002e
            java.lang.String r12 = "position"
            boolean r13 = r0.has(r12)
            if (r13 != 0) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            java.lang.String r17 = r0.getString(r6)     // Catch:{ JSONException -> 0x008f }
            long r12 = r0.getLong(r12)     // Catch:{ JSONException -> 0x008f }
            long r15 = com.google.android.gms.cast.internal.C143596v.m233270c(r12)     // Catch:{ JSONException -> 0x008f }
            java.lang.String r12 = "isWatched"
            boolean r20 = r0.optBoolean(r12)     // Catch:{ JSONException -> 0x008f }
            long r12 = r0.optLong(r5)     // Catch:{ JSONException -> 0x008f }
            long r18 = com.google.android.gms.cast.internal.C143596v.m233270c(r12)     // Catch:{ JSONException -> 0x008f }
            java.lang.String r12 = "breakClipIds"
            org.json.JSONArray r12 = r0.optJSONArray(r12)     // Catch:{ JSONException -> 0x008f }
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ JSONException -> 0x008f }
            if (r12 == 0) goto L_0x007a
            int r13 = r12.length()     // Catch:{ JSONException -> 0x008f }
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x008f }
            r14 = 0
        L_0x006b:
            int r9 = r12.length()     // Catch:{ JSONException -> 0x008f }
            if (r14 >= r9) goto L_0x007a
            java.lang.String r9 = r12.getString(r14)     // Catch:{ JSONException -> 0x008f }
            r13[r14] = r9     // Catch:{ JSONException -> 0x008f }
            int r14 = r14 + 1
            goto L_0x006b
        L_0x007a:
            r21 = r13
            java.lang.String r9 = "isEmbedded"
            boolean r22 = r0.optBoolean(r9)     // Catch:{ JSONException -> 0x008f }
            java.lang.String r9 = "expanded"
            boolean r23 = r0.optBoolean(r9)     // Catch:{ JSONException -> 0x008f }
            com.google.android.gms.cast.AdBreakInfo r0 = new com.google.android.gms.cast.AdBreakInfo     // Catch:{ JSONException -> 0x008f }
            r14 = r0
            r14.<init>(r15, r17, r18, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x008f }
            goto L_0x00a6
        L_0x008f:
            r0 = move-exception
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r12[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r9, r0, r12)
            java.lang.String r9 = "AdBreakInfo"
            android.util.Log.d(r9, r0)
            goto L_0x002e
        L_0x00a6:
            if (r0 == 0) goto L_0x00af
            r10.add(r0)
            int r11 = r11 + 1
            goto L_0x0022
        L_0x00af:
            r10.clear()
        L_0x00b2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            r1.f388642i = r0
        L_0x00b9:
            java.lang.String r0 = "breakClips"
            boolean r4 = r2.has(r0)
            if (r4 == 0) goto L_0x0194
            org.json.JSONArray r2 = r2.getJSONArray(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r2.length()
            r4.<init>(r0)
            r9 = 0
        L_0x00cf:
            int r0 = r2.length()
            if (r9 >= r0) goto L_0x018d
            org.json.JSONObject r0 = r2.getJSONObject(r9)
            if (r0 != 0) goto L_0x00de
        L_0x00db:
            r0 = 0
            goto L_0x0181
        L_0x00de:
            boolean r10 = r0.has(r6)
            if (r10 != 0) goto L_0x00e5
            goto L_0x00db
        L_0x00e5:
            java.lang.String r25 = r0.getString(r6)     // Catch:{ JSONException -> 0x0169 }
            long r10 = r0.optLong(r5)     // Catch:{ JSONException -> 0x0169 }
            long r27 = com.google.android.gms.cast.internal.C143596v.m233270c(r10)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r10 = "clickThroughUrl"
            java.lang.String r31 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r10)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r10 = "contentUrl"
            java.lang.String r29 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r10)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r10 = "mimeType"
            java.lang.String r10 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r10)     // Catch:{ JSONException -> 0x0169 }
            if (r10 != 0) goto L_0x010b
            java.lang.String r10 = "contentType"
            java.lang.String r10 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r10)     // Catch:{ JSONException -> 0x0169 }
        L_0x010b:
            r30 = r10
            java.lang.String r10 = "title"
            java.lang.String r26 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r10)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r10 = "customData"
            org.json.JSONObject r10 = r0.optJSONObject(r10)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r11 = "contentId"
            java.lang.String r33 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r11)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r11 = "posterUrl"
            java.lang.String r34 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r11)     // Catch:{ JSONException -> 0x0169 }
            boolean r11 = r0.has(r3)     // Catch:{ JSONException -> 0x0169 }
            if (r11 == 0) goto L_0x013b
            java.lang.Object r11 = r0.get(r3)     // Catch:{ JSONException -> 0x0169 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ JSONException -> 0x0169 }
            int r11 = r11.intValue()     // Catch:{ JSONException -> 0x0169 }
            long r11 = (long) r11     // Catch:{ JSONException -> 0x0169 }
            long r11 = com.google.android.gms.cast.internal.C143596v.m233270c(r11)     // Catch:{ JSONException -> 0x0169 }
            goto L_0x013d
        L_0x013b:
            r11 = -1
        L_0x013d:
            r35 = r11
            java.lang.String r11 = "hlsSegmentFormat"
            java.lang.String r37 = com.google.android.gms.cast.internal.C143596v.m233273f(r0, r11)     // Catch:{ JSONException -> 0x0169 }
            java.lang.String r11 = "vastAdsRequest"
            org.json.JSONObject r0 = r0.optJSONObject(r11)     // Catch:{ JSONException -> 0x0169 }
            com.google.android.gms.cast.VastAdsRequest r38 = com.google.android.gms.cast.VastAdsRequest.m232583a(r0)     // Catch:{ JSONException -> 0x0169 }
            com.google.android.gms.cast.AdBreakClipInfo r0 = new com.google.android.gms.cast.AdBreakClipInfo     // Catch:{ JSONException -> 0x0169 }
            if (r10 == 0) goto L_0x0161
            int r11 = r10.length()     // Catch:{ JSONException -> 0x0169 }
            if (r11 != 0) goto L_0x015a
            goto L_0x0161
        L_0x015a:
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x0169 }
            r32 = r10
            goto L_0x0163
        L_0x0161:
            r32 = 0
        L_0x0163:
            r24 = r0
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r37, r38)     // Catch:{ JSONException -> 0x0169 }
            goto L_0x0181
        L_0x0169:
            r0 = move-exception
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r11[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakClipInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r10, r0, r11)
            java.lang.String r10 = "AdBreakClipInfo"
            android.util.Log.d(r10, r0)
            goto L_0x00db
        L_0x0181:
            if (r0 == 0) goto L_0x018a
            r4.add(r0)
            int r9 = r9 + 1
            goto L_0x00cf
        L_0x018a:
            r4.clear()
        L_0x018d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r1.f388643j = r0
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.mo118404b(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f388651r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.f388651r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C144012l.m234191a(jSONObject, jSONObject2)) && C143596v.m233278k(this.f388634a, mediaInfo.f388634a) && this.f388635b == mediaInfo.f388635b && C143596v.m233278k(this.f388636c, mediaInfo.f388636c) && C143596v.m233278k(this.f388637d, mediaInfo.f388637d) && this.f388638e == mediaInfo.f388638e && C143596v.m233278k(this.f388639f, mediaInfo.f388639f) && C143596v.m233278k(this.f388640g, mediaInfo.f388640g) && C143596v.m233278k(this.f388642i, mediaInfo.f388642i) && C143596v.m233278k(this.f388643j, mediaInfo.f388643j) && C143596v.m233278k(this.f388644k, mediaInfo.f388644k) && C143596v.m233278k(this.f388645l, mediaInfo.f388645l) && this.f388646m == mediaInfo.f388646m && C143596v.m233278k(this.f388647n, mediaInfo.f388647n) && C143596v.m233278k(this.f388648o, mediaInfo.f388648o) && C143596v.m233278k(this.f388649p, mediaInfo.f388649p) && C143596v.m233278k(this.f388650q, mediaInfo.f388650q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388634a, Integer.valueOf(this.f388635b), this.f388636c, this.f388637d, Long.valueOf(this.f388638e), String.valueOf(this.f388651r), this.f388639f, this.f388640g, this.f388642i, this.f388643j, this.f388644k, this.f388645l, Long.valueOf(this.f388646m), this.f388647n, this.f388649p, this.f388650q});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        List list;
        JSONObject jSONObject = this.f388651r;
        List list2 = null;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388641h = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, mo118403a());
        C143947c.m234089h(parcel, 3, this.f388635b);
        C143947c.m234106y(parcel, 4, this.f388636c);
        C143947c.m234105x(parcel, 5, this.f388637d, i);
        C143947c.m234090i(parcel, 6, this.f388638e);
        C143947c.m234080C(parcel, 7, this.f388639f);
        C143947c.m234105x(parcel, 8, this.f388640g, i);
        C143947c.m234106y(parcel, 9, this.f388641h);
        List list3 = this.f388642i;
        if (list3 == null) {
            list = null;
        } else {
            list = Collections.unmodifiableList(list3);
        }
        C143947c.m234080C(parcel, 10, list);
        List list4 = this.f388643j;
        if (list4 != null) {
            list2 = Collections.unmodifiableList(list4);
        }
        C143947c.m234080C(parcel, 11, list2);
        C143947c.m234106y(parcel, 12, this.f388644k);
        C143947c.m234105x(parcel, 13, this.f388645l, i);
        C143947c.m234090i(parcel, 14, this.f388646m);
        C143947c.m234106y(parcel, 15, this.f388647n);
        C143947c.m234106y(parcel, 16, this.f388648o);
        C143947c.m234106y(parcel, 17, this.f388649p);
        C143947c.m234106y(parcel, 18, this.f388650q);
        C143947c.m234083b(parcel, a);
    }

    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, (String) null, (MediaMetadata) null, -1, (List) null, (TextTrackStyle) null, (String) null, (List) null, (List) null, (String) null, (VastAdsRequest) null, -1, (String) null, (String) null, (String) null, (String) null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        C58485gu guVar;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f388635b = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.f388635b = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.f388635b = 2;
            } else {
                mediaInfo.f388635b = -1;
            }
        }
        mediaInfo.f388636c = C143596v.m233273f(jSONObject2, "contentType");
        if (jSONObject2.has("metadata")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject3.getInt("metadataType"));
            mediaInfo.f388637d = mediaMetadata;
            mediaMetadata.mo118416c(jSONObject3);
        }
        mediaInfo.f388638e = -1;
        if (mediaInfo.f388635b != 2 && jSONObject2.has("duration") && !jSONObject2.isNull("duration")) {
            double optDouble = jSONObject2.optDouble("duration", C59203do.f157270a);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= C59203do.f157270a) {
                mediaInfo.f388638e = C143596v.m233269b(optDouble);
            }
        }
        if (jSONObject2.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray("tracks");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                long j = jSONObject4.getLong("trackId");
                String optString2 = jSONObject4.optString("type");
                if ("TEXT".equals(optString2)) {
                    i = 1;
                } else if ("AUDIO".equals(optString2)) {
                    i = 2;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String f = C143596v.m233273f(jSONObject4, "trackContentId");
                String f2 = C143596v.m233273f(jSONObject4, "trackContentType");
                String f3 = C143596v.m233273f(jSONObject4, "name");
                String f4 = C143596v.m233273f(jSONObject4, "language");
                if (jSONObject4.has("subtype")) {
                    String string = jSONObject4.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        i2 = "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject4.has("roles")) {
                    C58480gp e = C58485gu.m89837e();
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("roles");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        e.mo55395g(jSONArray2.optString(i4));
                    }
                    guVar = e.mo55394f();
                } else {
                    guVar = null;
                }
                arrayList.add(new MediaTrack(j, i, f, f2, f3, f4, i2, guVar, jSONObject4.optJSONObject("customData")));
            }
            mediaInfo.f388639f = new ArrayList(arrayList);
        } else {
            mediaInfo.f388639f = null;
        }
        if (jSONObject2.has("textTrackStyle")) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle(1.0f, 0, 0, -1, 0, -1, 0, 0, (String) null, -1, -1, (String) null);
            textTrackStyle.f388736a = (float) jSONObject5.optDouble("fontScale", 1.0d);
            textTrackStyle.f388737b = TextTrackStyle.m232581a(jSONObject5.optString("foregroundColor"));
            textTrackStyle.f388738c = TextTrackStyle.m232581a(jSONObject5.optString("backgroundColor"));
            if (jSONObject5.has("edgeType")) {
                String string2 = jSONObject5.getString("edgeType");
                if ("NONE".equals(string2)) {
                    textTrackStyle.f388739d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    textTrackStyle.f388739d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    textTrackStyle.f388739d = 2;
                } else if ("RAISED".equals(string2)) {
                    textTrackStyle.f388739d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    textTrackStyle.f388739d = 4;
                }
            }
            textTrackStyle.f388740e = TextTrackStyle.m232581a(jSONObject5.optString("edgeColor"));
            if (jSONObject5.has("windowType")) {
                String string3 = jSONObject5.getString("windowType");
                if ("NONE".equals(string3)) {
                    textTrackStyle.f388741f = 0;
                } else if ("NORMAL".equals(string3)) {
                    textTrackStyle.f388741f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    textTrackStyle.f388741f = 2;
                }
            }
            textTrackStyle.f388742g = TextTrackStyle.m232581a(jSONObject5.optString("windowColor"));
            if (textTrackStyle.f388741f == 2) {
                textTrackStyle.f388743h = jSONObject5.optInt("windowRoundedCornerRadius", 0);
            }
            textTrackStyle.f388744i = C143596v.m233273f(jSONObject5, "fontFamily");
            if (jSONObject5.has("fontGenericFamily")) {
                String string4 = jSONObject5.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    textTrackStyle.f388745j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    textTrackStyle.f388745j = 1;
                } else if ("SERIF".equals(string4)) {
                    textTrackStyle.f388745j = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    textTrackStyle.f388745j = 3;
                } else if ("CASUAL".equals(string4)) {
                    textTrackStyle.f388745j = 4;
                } else if ("CURSIVE".equals(string4)) {
                    textTrackStyle.f388745j = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    textTrackStyle.f388745j = 6;
                }
            }
            if (jSONObject5.has("fontStyle")) {
                String string5 = jSONObject5.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    textTrackStyle.f388746k = 0;
                } else if ("BOLD".equals(string5)) {
                    textTrackStyle.f388746k = 1;
                } else if ("ITALIC".equals(string5)) {
                    textTrackStyle.f388746k = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    textTrackStyle.f388746k = 3;
                }
            }
            textTrackStyle.f388748m = jSONObject5.optJSONObject("customData");
            mediaInfo.f388640g = textTrackStyle;
        } else {
            mediaInfo.f388640g = null;
        }
        mo118404b(jSONObject);
        mediaInfo.f388651r = jSONObject2.optJSONObject("customData");
        mediaInfo.f388644k = C143596v.m233273f(jSONObject2, "entity");
        mediaInfo.f388647n = C143596v.m233273f(jSONObject2, "atvEntity");
        mediaInfo.f388645l = VastAdsRequest.m232583a(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (jSONObject2.has("startAbsoluteTime") && !jSONObject2.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject2.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= C59203do.f157270a) {
                mediaInfo.f388646m = C143596v.m233269b(optDouble2);
            }
        }
        if (jSONObject2.has("contentUrl")) {
            mediaInfo.f388648o = jSONObject2.optString("contentUrl");
        }
        mediaInfo.f388649p = C143596v.m233273f(jSONObject2, "hlsSegmentFormat");
        mediaInfo.f388650q = C143596v.m233273f(jSONObject2, "hlsVideoSegmentFormat");
    }
}
