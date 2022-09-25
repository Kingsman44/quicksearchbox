package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class MediaStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143370ba();

    /* renamed from: a */
    public MediaInfo f388699a;

    /* renamed from: b */
    public long f388700b;

    /* renamed from: c */
    public int f388701c;

    /* renamed from: d */
    public double f388702d;

    /* renamed from: e */
    public int f388703e;

    /* renamed from: f */
    public int f388704f;

    /* renamed from: g */
    public long f388705g;

    /* renamed from: h */
    long f388706h;

    /* renamed from: i */
    double f388707i;

    /* renamed from: j */
    boolean f388708j;

    /* renamed from: k */
    public long[] f388709k;

    /* renamed from: l */
    public int f388710l;

    /* renamed from: m */
    int f388711m;

    /* renamed from: n */
    String f388712n;

    /* renamed from: o */
    public JSONObject f388713o;

    /* renamed from: p */
    public int f388714p;

    /* renamed from: q */
    public final List f388715q;

    /* renamed from: r */
    public boolean f388716r;

    /* renamed from: s */
    AdBreakStatus f388717s;

    /* renamed from: t */
    VideoInfo f388718t;

    /* renamed from: u */
    public MediaLiveSeekableRange f388719u;

    /* renamed from: v */
    public MediaQueueData f388720v;

    /* renamed from: w */
    boolean f388721w;

    /* renamed from: x */
    private final SparseArray f388722x;

    static {
        new C143566ae("MediaStatus");
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        String str2 = str;
        List list2 = list;
        MediaQueueData mediaQueueData2 = mediaQueueData;
        this.f388715q = new ArrayList();
        this.f388722x = new SparseArray();
        this.f388699a = mediaInfo;
        this.f388700b = j;
        this.f388701c = i;
        this.f388702d = d;
        this.f388703e = i2;
        this.f388704f = i3;
        this.f388705g = j2;
        this.f388706h = j3;
        this.f388707i = d2;
        this.f388708j = z;
        this.f388709k = jArr;
        this.f388710l = i4;
        this.f388711m = i5;
        this.f388712n = str2;
        if (str2 != null) {
            try {
                this.f388713o = new JSONObject(this.f388712n);
            } catch (JSONException unused) {
                this.f388713o = null;
                this.f388712n = null;
            }
        } else {
            this.f388713o = null;
        }
        this.f388714p = i6;
        if (list2 != null && !list.isEmpty()) {
            m232575g(list2);
        }
        this.f388716r = z2;
        this.f388717s = adBreakStatus;
        this.f388718t = videoInfo;
        this.f388719u = mediaLiveSeekableRange;
        this.f388720v = mediaQueueData2;
        boolean z3 = false;
        if (mediaQueueData2 != null && mediaQueueData2.f388688i) {
            z3 = true;
        }
        this.f388721w = z3;
    }

    /* renamed from: f */
    public static final boolean m232574f(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    /* renamed from: g */
    private final void m232575g(List list) {
        this.f388715q.clear();
        this.f388722x.clear();
        for (int i = 0; i < list.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
            this.f388715q.add(mediaQueueItem);
            this.f388722x.put(mediaQueueItem.f388691b, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02d5, code lost:
        if (r15 == false) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018c, code lost:
        if (r13.f388709k != null) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x038a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo118434a(org.json.JSONObject r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "extendedStatus"
            org.json.JSONObject r1 = r14.optJSONObject(r0)
            r2 = 0
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ JSONException -> 0x004c }
            r3.<init>()     // Catch:{ JSONException -> 0x004c }
            java.util.Iterator r4 = r14.keys()     // Catch:{ JSONException -> 0x004c }
        L_0x0012:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x004c }
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x004c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x004c }
            r3.add(r5)     // Catch:{ JSONException -> 0x004c }
            goto L_0x0012
        L_0x0022:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004c }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ JSONException -> 0x004c }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ JSONException -> 0x004c }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ JSONException -> 0x004c }
            r4.<init>(r14, r3)     // Catch:{ JSONException -> 0x004c }
            java.util.Iterator r3 = r1.keys()     // Catch:{ JSONException -> 0x004c }
        L_0x0033:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x004c }
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x004c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x004c }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ JSONException -> 0x004c }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x004c }
            goto L_0x0033
        L_0x0047:
            r4.remove(r0)     // Catch:{ JSONException -> 0x004c }
            r14 = r4
            goto L_0x004d
        L_0x004c:
        L_0x004d:
            java.lang.String r0 = "mediaSessionId"
            long r0 = r14.getLong(r0)
            long r3 = r13.f388700b
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x005e
            r13.f388700b = r0
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            java.lang.String r1 = "playerState"
            boolean r3 = r14.has(r1)
            r4 = 2
            if (r3 == 0) goto L_0x00e7
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "IDLE"
            boolean r3 = r1.equals(r3)
            r6 = 3
            r7 = 4
            if (r3 == 0) goto L_0x0078
            r1 = 1
            goto L_0x00a1
        L_0x0078:
            java.lang.String r3 = "PLAYING"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0082
            r1 = 2
            goto L_0x00a1
        L_0x0082:
            java.lang.String r3 = "PAUSED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008c
            r1 = 3
            goto L_0x00a1
        L_0x008c:
            java.lang.String r3 = "BUFFERING"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0096
            r1 = 4
            goto L_0x00a1
        L_0x0096:
            java.lang.String r3 = "LOADING"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a0
            r1 = 5
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r13.f388703e
            if (r1 == r3) goto L_0x00a9
            r13.f388703e = r1
            r0 = r0 | 2
        L_0x00a9:
            if (r1 != r5) goto L_0x00e7
            java.lang.String r1 = "idleReason"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00e7
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "CANCELLED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00c1
            r6 = 2
            goto L_0x00df
        L_0x00c1:
            java.lang.String r3 = "INTERRUPTED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00ca
            goto L_0x00df
        L_0x00ca:
            java.lang.String r3 = "FINISHED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00d4
            r6 = 1
            goto L_0x00df
        L_0x00d4:
            java.lang.String r3 = "ERROR"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00de
            r6 = 4
            goto L_0x00df
        L_0x00de:
            r6 = 0
        L_0x00df:
            int r1 = r13.f388704f
            if (r6 == r1) goto L_0x00e7
            r13.f388704f = r6
            r0 = r0 | 2
        L_0x00e7:
            java.lang.String r1 = "playbackRate"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00fd
            double r6 = r14.getDouble(r1)
            double r8 = r13.f388702d
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00fd
            r13.f388702d = r6
            r0 = r0 | 2
        L_0x00fd:
            java.lang.String r1 = "currentTime"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x0119
            double r6 = r14.getDouble(r1)
            long r6 = com.google.android.gms.cast.internal.C143596v.m233269b(r6)
            long r8 = r13.f388705g
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0117
            r13.f388705g = r6
            r0 = r0 | 2
        L_0x0117:
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x0119:
            java.lang.String r1 = "supportedMediaCommands"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x012f
            long r6 = r14.getLong(r1)
            long r8 = r13.f388706h
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012f
            r13.f388706h = r6
            r0 = r0 | 2
        L_0x012f:
            java.lang.String r1 = "volume"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x015b
            if (r15 != 0) goto L_0x015b
            org.json.JSONObject r15 = r14.getJSONObject(r1)
            java.lang.String r1 = "level"
            double r6 = r15.getDouble(r1)
            double r8 = r13.f388707i
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x014d
            r13.f388707i = r6
            r0 = r0 | 2
        L_0x014d:
            java.lang.String r1 = "muted"
            boolean r15 = r15.getBoolean(r1)
            boolean r1 = r13.f388708j
            if (r15 == r1) goto L_0x015b
            r13.f388708j = r15
            r0 = r0 | 2
        L_0x015b:
            java.lang.String r15 = "activeTrackIds"
            boolean r1 = r14.has(r15)
            r3 = 0
            if (r1 == 0) goto L_0x0169
            org.json.JSONArray r15 = r14.getJSONArray(r15)
            goto L_0x016a
        L_0x0169:
            r15 = r3
        L_0x016a:
            long[] r15 = com.google.android.gms.cast.internal.C143596v.m233280m(r15)
            if (r15 == 0) goto L_0x018a
            long[] r1 = r13.f388709k
            if (r1 != 0) goto L_0x0175
            goto L_0x018e
        L_0x0175:
            int r1 = r1.length
            int r6 = r15.length
            if (r1 != r6) goto L_0x018e
            r1 = 0
        L_0x017a:
            int r6 = r15.length
            if (r1 >= r6) goto L_0x0192
            long[] r6 = r13.f388709k
            r7 = r6[r1]
            r9 = r15[r1]
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x018e
            int r1 = r1 + 1
            goto L_0x017a
        L_0x018a:
            long[] r1 = r13.f388709k
            if (r1 == 0) goto L_0x0192
        L_0x018e:
            r13.f388709k = r15
            r0 = r0 | 2
        L_0x0192:
            java.lang.String r15 = "customData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01a4
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r13.f388713o = r15
            r13.f388712n = r3
            r0 = r0 | 2
        L_0x01a4:
            java.lang.String r15 = "media"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01cd
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            com.google.android.gms.cast.MediaInfo r1 = new com.google.android.gms.cast.MediaInfo
            r1.<init>(r15)
            com.google.android.gms.cast.MediaInfo r6 = r13.f388699a
            if (r6 == 0) goto L_0x01bf
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x01c3
        L_0x01bf:
            r13.f388699a = r1
            r0 = r0 | 2
        L_0x01c3:
            java.lang.String r1 = "metadata"
            boolean r15 = r15.has(r1)
            if (r15 == 0) goto L_0x01cd
            r0 = r0 | 4
        L_0x01cd:
            java.lang.String r15 = "currentItemId"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01e1
            int r15 = r14.getInt(r15)
            int r1 = r13.f388701c
            if (r1 == r15) goto L_0x01e1
            r13.f388701c = r15
            r0 = r0 | 2
        L_0x01e1:
            java.lang.String r15 = "preloadedItemId"
            int r15 = r14.optInt(r15, r2)
            int r1 = r13.f388711m
            if (r1 == r15) goto L_0x01ef
            r13.f388711m = r15
            r0 = r0 | 16
        L_0x01ef:
            java.lang.String r15 = "loadingItemId"
            int r15 = r14.optInt(r15, r2)
            int r1 = r13.f388710l
            if (r1 == r15) goto L_0x01fe
            r13.f388710l = r15
            r0 = r0 | 2
            goto L_0x01ff
        L_0x01fe:
            r15 = r1
        L_0x01ff:
            com.google.android.gms.cast.MediaInfo r1 = r13.f388699a
            if (r1 != 0) goto L_0x0205
            r1 = -1
            goto L_0x0207
        L_0x0205:
            int r1 = r1.f388635b
        L_0x0207:
            int r6 = r13.f388703e
            int r7 = r13.f388704f
            boolean r15 = m232574f(r6, r7, r15, r1)
            if (r15 != 0) goto L_0x02d8
            java.lang.String r15 = "repeatMode"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x023e
            java.lang.String r15 = r14.getString(r15)
            java.lang.Integer r15 = com.google.android.gms.cast.internal.p10776a.C143560a.m233151a(r15)
            if (r15 != 0) goto L_0x0226
            int r15 = r13.f388714p
            goto L_0x022a
        L_0x0226:
            int r15 = r15.intValue()
        L_0x022a:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            int r1 = r13.f388714p
            int r6 = r15.intValue()
            if (r1 == r6) goto L_0x023e
            int r15 = r15.intValue()
            r13.f388714p = r15
            r15 = 1
            goto L_0x023f
        L_0x023e:
            r15 = 0
        L_0x023f:
            java.lang.String r1 = "items"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x02d5
            org.json.JSONArray r1 = r14.getJSONArray(r1)
            int r6 = r1.length()
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r8 = 0
        L_0x0255:
            if (r8 >= r6) goto L_0x026b
            org.json.JSONObject r9 = r1.getJSONObject(r8)
            java.lang.String r10 = "itemId"
            int r9 = r9.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r8, r9)
            int r8 = r8 + 1
            goto L_0x0255
        L_0x026b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
        L_0x0271:
            if (r9 >= r6) goto L_0x02c5
            java.lang.Object r10 = r7.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            org.json.JSONObject r11 = r1.getJSONObject(r9)
            int r12 = r10.intValue()
            com.google.android.gms.cast.MediaQueueItem r12 = r13.mo118436c(r12)
            if (r12 == 0) goto L_0x029e
            boolean r11 = r12.mo118430a(r11)
            r15 = r15 | r11
            r8.add(r12)
            int r10 = r10.intValue()
            java.lang.Integer r10 = r13.mo118437d(r10)
            int r10 = r10.intValue()
            if (r9 == r10) goto L_0x02c2
            goto L_0x02c1
        L_0x029e:
            int r15 = r10.intValue()
            int r10 = r13.f388701c
            if (r15 != r10) goto L_0x02b9
            com.google.android.gms.cast.MediaInfo r15 = r13.f388699a
            if (r15 == 0) goto L_0x02b9
            com.google.android.gms.cast.MediaQueueItem r10 = new com.google.android.gms.cast.MediaQueueItem
            r10.<init>((com.google.android.gms.cast.MediaInfo) r15)
            com.google.android.gms.cast.C143366ax.m232629a(r10)
            r10.mo118430a(r11)
            r8.add(r10)
            goto L_0x02c1
        L_0x02b9:
            com.google.android.gms.cast.MediaQueueItem r15 = new com.google.android.gms.cast.MediaQueueItem
            r15.<init>((org.json.JSONObject) r11)
            r8.add(r15)
        L_0x02c1:
            r15 = 1
        L_0x02c2:
            int r9 = r9 + 1
            goto L_0x0271
        L_0x02c5:
            java.util.List r1 = r13.f388715q
            int r1 = r1.size()
            if (r1 == r6) goto L_0x02cf
            r1 = 0
            goto L_0x02d0
        L_0x02cf:
            r1 = 1
        L_0x02d0:
            r1 = r1 ^ r5
            r15 = r15 | r1
            r13.m232575g(r8)
        L_0x02d5:
            if (r15 == 0) goto L_0x02f4
            goto L_0x02f2
        L_0x02d8:
            r13.f388701c = r2
            r13.f388710l = r2
            r13.f388711m = r2
            java.util.List r15 = r13.f388715q
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x02f4
            r13.f388714p = r2
            java.util.List r15 = r13.f388715q
            r15.clear()
            android.util.SparseArray r15 = r13.f388722x
            r15.clear()
        L_0x02f2:
            r0 = r0 | 8
        L_0x02f4:
            java.lang.String r15 = "breakStatus"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.AdBreakStatus r15 = com.google.android.gms.cast.AdBreakStatus.m232552a(r15)
            com.google.android.gms.cast.AdBreakStatus r1 = r13.f388717s
            if (r1 != 0) goto L_0x0304
            if (r15 != 0) goto L_0x030c
        L_0x0304:
            if (r1 == 0) goto L_0x031d
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x031d
        L_0x030c:
            if (r15 == 0) goto L_0x0317
            java.lang.String r1 = r15.f388589c
            if (r1 != 0) goto L_0x0316
            java.lang.String r1 = r15.f388590d
            if (r1 == 0) goto L_0x0317
        L_0x0316:
            r2 = 1
        L_0x0317:
            r13.f388716r = r2
            r13.f388717s = r15
            r0 = r0 | 32
        L_0x031d:
            java.lang.String r15 = "videoInfo"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.VideoInfo r15 = com.google.android.gms.cast.VideoInfo.m232585a(r15)
            com.google.android.gms.cast.VideoInfo r1 = r13.f388718t
            if (r1 != 0) goto L_0x032d
            if (r15 != 0) goto L_0x0335
        L_0x032d:
            if (r1 == 0) goto L_0x0339
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0339
        L_0x0335:
            r13.f388718t = r15
            r0 = r0 | 64
        L_0x0339:
            java.lang.String r15 = "breakInfo"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x034e
            com.google.android.gms.cast.MediaInfo r1 = r13.f388699a
            if (r1 == 0) goto L_0x034e
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.mo118404b(r15)
            r0 = r0 | 2
        L_0x034e:
            java.lang.String r15 = "queueData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0373
            com.google.android.gms.cast.MediaQueueData r1 = new com.google.android.gms.cast.MediaQueueData
            r1.<init>()
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.mo118426a(r15)
            com.google.android.gms.cast.MediaQueueData r15 = new com.google.android.gms.cast.MediaQueueData
            r15.<init>(r1)
            r13.f388720v = r15
            boolean r15 = r15.f388688i
            boolean r1 = r13.f388721w
            if (r1 == r15) goto L_0x0373
            r13.f388721w = r15
            r0 = r0 | 8
        L_0x0373:
            java.lang.String r15 = "liveSeekableRange"
            boolean r15 = r14.has(r15)
            if (r15 == 0) goto L_0x038a
            java.lang.String r15 = "liveSeekableRange"
            org.json.JSONObject r14 = r14.optJSONObject(r15)
            com.google.android.gms.cast.MediaLiveSeekableRange r14 = com.google.android.gms.cast.MediaLiveSeekableRange.m232561a(r14)
            r13.f388719u = r14
            r14 = r0 | 2
            goto L_0x0393
        L_0x038a:
            com.google.android.gms.cast.MediaLiveSeekableRange r14 = r13.f388719u
            if (r14 == 0) goto L_0x0390
            r0 = r0 | 2
        L_0x0390:
            r13.f388719u = r3
            r14 = r0
        L_0x0393:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.mo118434a(org.json.JSONObject, int):int");
    }

    /* renamed from: b */
    public final int mo118435b() {
        return this.f388715q.size();
    }

    /* renamed from: c */
    public final MediaQueueItem mo118436c(int i) {
        Integer num = (Integer) this.f388722x.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.f388715q.get(num.intValue());
    }

    /* renamed from: d */
    public final Integer mo118437d(int i) {
        return (Integer) this.f388722x.get(i);
    }

    /* renamed from: e */
    public final boolean mo118438e(long j) {
        return (j & this.f388706h) != 0;
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.f388713o == null) == (mediaStatus.f388713o == null) && this.f388700b == mediaStatus.f388700b && this.f388701c == mediaStatus.f388701c && this.f388702d == mediaStatus.f388702d && this.f388703e == mediaStatus.f388703e && this.f388704f == mediaStatus.f388704f && this.f388705g == mediaStatus.f388705g && this.f388707i == mediaStatus.f388707i && this.f388708j == mediaStatus.f388708j && this.f388710l == mediaStatus.f388710l && this.f388711m == mediaStatus.f388711m && this.f388714p == mediaStatus.f388714p && Arrays.equals(this.f388709k, mediaStatus.f388709k) && C143596v.m233278k(Long.valueOf(this.f388706h), Long.valueOf(mediaStatus.f388706h)) && C143596v.m233278k(this.f388715q, mediaStatus.f388715q) && C143596v.m233278k(this.f388699a, mediaStatus.f388699a) && ((jSONObject = this.f388713o) == null || (jSONObject2 = mediaStatus.f388713o) == null || C144012l.m234191a(jSONObject, jSONObject2)) && this.f388716r == mediaStatus.f388716r && C143596v.m233278k(this.f388717s, mediaStatus.f388717s) && C143596v.m233278k(this.f388718t, mediaStatus.f388718t) && C143596v.m233278k(this.f388719u, mediaStatus.f388719u) && C143912ba.m233950b(this.f388720v, mediaStatus.f388720v) && this.f388721w == mediaStatus.f388721w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388699a, Long.valueOf(this.f388700b), Integer.valueOf(this.f388701c), Double.valueOf(this.f388702d), Integer.valueOf(this.f388703e), Integer.valueOf(this.f388704f), Long.valueOf(this.f388705g), Long.valueOf(this.f388706h), Double.valueOf(this.f388707i), Boolean.valueOf(this.f388708j), Integer.valueOf(Arrays.hashCode(this.f388709k)), Integer.valueOf(this.f388710l), Integer.valueOf(this.f388711m), String.valueOf(this.f388713o), Integer.valueOf(this.f388714p), this.f388715q, Boolean.valueOf(this.f388716r), this.f388717s, this.f388718t, this.f388719u, this.f388720v});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388713o;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388712n = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f388699a, i);
        C143947c.m234090i(parcel, 3, this.f388700b);
        C143947c.m234089h(parcel, 4, this.f388701c);
        C143947c.m234086e(parcel, 5, this.f388702d);
        C143947c.m234089h(parcel, 6, this.f388703e);
        C143947c.m234089h(parcel, 7, this.f388704f);
        C143947c.m234090i(parcel, 8, this.f388705g);
        C143947c.m234090i(parcel, 9, this.f388706h);
        C143947c.m234086e(parcel, 10, this.f388707i);
        C143947c.m234084c(parcel, 11, this.f388708j);
        C143947c.m234102u(parcel, 12, this.f388709k);
        C143947c.m234089h(parcel, 13, this.f388710l);
        C143947c.m234089h(parcel, 14, this.f388711m);
        C143947c.m234106y(parcel, 15, this.f388712n);
        C143947c.m234089h(parcel, 16, this.f388714p);
        C143947c.m234080C(parcel, 17, this.f388715q);
        C143947c.m234084c(parcel, 18, this.f388716r);
        C143947c.m234105x(parcel, 19, this.f388717s, i);
        C143947c.m234105x(parcel, 20, this.f388718t, i);
        C143947c.m234105x(parcel, 21, this.f388719u, i);
        C143947c.m234105x(parcel, 22, this.f388720v, i);
        C143947c.m234083b(parcel, a);
    }

    public MediaStatus(JSONObject jSONObject) {
        this((MediaInfo) null, 0, 0, C59203do.f157270a, 0, 0, 0, 0, C59203do.f157270a, false, (long[]) null, 0, 0, (String) null, 0, (List) null, false, (AdBreakStatus) null, (VideoInfo) null, (MediaLiveSeekableRange) null, (MediaQueueData) null);
        mo118434a(jSONObject, 0);
    }
}
