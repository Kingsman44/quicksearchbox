package androidx.slice;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import androidx.core.p097i.C1969d;
import androidx.core.p097i.C1970e;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.evernote.android.state.BuildConfig;
import java.util.List;

/* compiled from: PG */
public final class SliceItem extends CustomVersionedParcelable {

    /* renamed from: a */
    public String[] f13091a;

    /* renamed from: b */
    public String f13092b;

    /* renamed from: c */
    public String f13093c;

    /* renamed from: d */
    public Object f13094d;

    /* renamed from: e */
    CharSequence f13095e;

    /* renamed from: f */
    SliceItemHolder f13096f;

    public SliceItem() {
        this.f13091a = Slice.f13085a;
        this.f13092b = "text";
        this.f13093c = null;
    }

    public SliceItem(PendingIntent pendingIntent, Slice slice, String str, String[] strArr) {
        this((Object) new C1970e(pendingIntent, slice), "action", str, strArr);
    }

    public SliceItem(Object obj, String str, String str2, String[] strArr) {
        this.f13091a = strArr;
        this.f13092b = str;
        this.f13093c = str2;
        this.f13094d = obj;
    }

    /* renamed from: i */
    private static void m11727i(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            Object obj2 = true != m11728j(obj) ? null : obj;
            if (obj2 != obj) {
                if (obj2 != null) {
                    spannable.setSpan(obj2, spannable.getSpanStart(obj), spannable.getSpanEnd(obj), spannable.getSpanFlags(obj));
                }
                spannable.removeSpan(obj);
            }
        }
    }

    /* renamed from: j */
    private static boolean m11728j(Object obj) {
        return (obj instanceof AlignmentSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof StyleSpan);
    }

    /* renamed from: a */
    public final int mo8593a() {
        C1969d.m5306a(this.f13094d, "Object must be non-null for FORMAT_INT");
        return ((Integer) this.f13094d).intValue();
    }

    /* renamed from: b */
    public final long mo8594b() {
        C1969d.m5306a(this.f13094d, "Object must be non-null for FORMAT_LONG");
        return ((Long) this.f13094d).longValue();
    }

    /* renamed from: c */
    public final PendingIntent mo8595c() {
        C1969d.m5306a(this.f13094d, "Object must be non-null");
        Object obj = ((C1970e) this.f13094d).f5888a;
        if (obj instanceof PendingIntent) {
            return (PendingIntent) obj;
        }
        return null;
    }

    /* renamed from: d */
    public final Slice mo8596d() {
        C1969d.m5306a(this.f13094d, "Object must be non-null for FORMAT_SLICE");
        if ("action".equals(this.f13092b)) {
            return (Slice) ((C1970e) this.f13094d).f5889b;
        }
        return (Slice) this.f13094d;
    }

    /* renamed from: e */
    public final CharSequence mo8597e() {
        if (this.f13095e == null) {
            CharSequence charSequence = (CharSequence) this.f13094d;
            if (charSequence instanceof Spannable) {
                m11727i((Spannable) charSequence);
            } else if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                int i = 0;
                Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                int length = spans.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!m11728j(spans[i])) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        m11727i(spannableString);
                        charSequence = spannableString;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.f13095e = charSequence;
        }
        return this.f13095e;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        if (r4.equals("action") != false) goto L_0x00d6;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo8598f(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = r0.f13092b
            r2.append(r3)
            java.lang.String r3 = r0.f13093c
            if (r3 == 0) goto L_0x0024
            r3 = 60
            r2.append(r3)
            java.lang.String r3 = r0.f13093c
            r2.append(r3)
            r3 = 62
            r2.append(r3)
        L_0x0024:
            r3 = 32
            r2.append(r3)
            java.lang.String[] r4 = r0.f13091a
            int r5 = r4.length
            if (r5 <= 0) goto L_0x0034
            androidx.slice.Slice.m11724b(r2, r4)
            r2.append(r3)
        L_0x0034:
            java.lang.String r3 = "  "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r4 = r0.f13092b
            int r5 = r4.hashCode()
            java.lang.String r6 = "slice"
            java.lang.String r7 = "image"
            java.lang.String r8 = "text"
            java.lang.String r9 = "long"
            java.lang.String r10 = "int"
            java.lang.String r11 = "action"
            r12 = 3
            r13 = 2
            r14 = 1
            switch(r5) {
                case -1422950858: goto L_0x007b;
                case 104431: goto L_0x0073;
                case 3327612: goto L_0x006b;
                case 3556653: goto L_0x0063;
                case 100313435: goto L_0x005b;
                case 109526418: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0083
        L_0x0053:
            boolean r5 = r4.equals(r6)
            if (r5 == 0) goto L_0x0083
            r5 = 0
            goto L_0x0084
        L_0x005b:
            boolean r5 = r4.equals(r7)
            if (r5 == 0) goto L_0x0083
            r5 = 3
            goto L_0x0084
        L_0x0063:
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L_0x0083
            r5 = 2
            goto L_0x0084
        L_0x006b:
            boolean r5 = r4.equals(r9)
            if (r5 == 0) goto L_0x0083
            r5 = 5
            goto L_0x0084
        L_0x0073:
            boolean r5 = r4.equals(r10)
            if (r5 == 0) goto L_0x0083
            r5 = 4
            goto L_0x0084
        L_0x007b:
            boolean r5 = r4.equals(r11)
            if (r5 == 0) goto L_0x0083
            r5 = 1
            goto L_0x0084
        L_0x0083:
            r5 = -1
        L_0x0084:
            java.lang.String r15 = "Slice must be non-null for FORMAT_SLICE"
            if (r5 == 0) goto L_0x0209
            if (r5 == r14) goto L_0x01cf
            if (r5 == r13) goto L_0x01bf
            if (r5 == r12) goto L_0x01b7
            r1 = 4
            if (r5 == r1) goto L_0x013f
            r1 = 5
            if (r5 == r1) goto L_0x00fd
            int r3 = r4.hashCode()
            switch(r3) {
                case -1422950858: goto L_0x00ce;
                case 104431: goto L_0x00c6;
                case 3327612: goto L_0x00be;
                case 3556653: goto L_0x00b6;
                case 100313435: goto L_0x00ae;
                case 100358090: goto L_0x00a4;
                case 109526418: goto L_0x009c;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x00d5
        L_0x009c:
            boolean r1 = r4.equals(r6)
            if (r1 == 0) goto L_0x00d5
            r12 = 0
            goto L_0x00d6
        L_0x00a4:
            java.lang.String r1 = "input"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00d5
            r12 = 6
            goto L_0x00d6
        L_0x00ae:
            boolean r1 = r4.equals(r7)
            if (r1 == 0) goto L_0x00d5
            r12 = 2
            goto L_0x00d6
        L_0x00b6:
            boolean r1 = r4.equals(r8)
            if (r1 == 0) goto L_0x00d5
            r12 = 1
            goto L_0x00d6
        L_0x00be:
            boolean r3 = r4.equals(r9)
            if (r3 == 0) goto L_0x00d5
            r12 = 5
            goto L_0x00d6
        L_0x00c6:
            boolean r1 = r4.equals(r10)
            if (r1 == 0) goto L_0x00d5
            r12 = 4
            goto L_0x00d6
        L_0x00ce:
            boolean r1 = r4.equals(r11)
            if (r1 == 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r12 = -1
        L_0x00d6:
            switch(r12) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00e4;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.String r1 = "Unrecognized format: "
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r1 = r1.concat(r3)
            goto L_0x00f8
        L_0x00e4:
            java.lang.String r1 = "RemoteInput"
            goto L_0x00f8
        L_0x00e7:
            java.lang.String r1 = "Long"
            goto L_0x00f8
        L_0x00ea:
            java.lang.String r1 = "Int"
            goto L_0x00f8
        L_0x00ed:
            java.lang.String r1 = "Action"
            goto L_0x00f8
        L_0x00f0:
            java.lang.String r1 = "Image"
            goto L_0x00f8
        L_0x00f3:
            java.lang.String r1 = "Text"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r1 = "Slice"
        L_0x00f8:
            r2.append(r1)
            goto L_0x0229
        L_0x00fd:
            java.lang.String r1 = "millis"
            java.lang.String r3 = r0.f13093c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0131
            long r3 = r16.mo8594b()
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0118
            java.lang.String r1 = "INFINITY"
            r2.append(r1)
            goto L_0x0229
        L_0x0118:
            long r3 = r16.mo8594b()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            long r5 = r1.getTimeInMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 262144(0x40000, float:3.67342E-40)
            java.lang.CharSequence r1 = android.text.format.DateUtils.getRelativeTimeSpanString(r3, r5, r7, r9)
            r2.append(r1)
            goto L_0x0229
        L_0x0131:
            long r3 = r16.mo8594b()
            r2.append(r3)
            r1 = 76
            r2.append(r1)
            goto L_0x0229
        L_0x013f:
            java.lang.String r1 = "color"
            java.lang.String r3 = r0.f13093c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0184
            int r1 = r16.mo8593a()
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = android.graphics.Color.alpha(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = android.graphics.Color.red(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            int r4 = android.graphics.Color.green(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            int r1 = android.graphics.Color.blue(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r12] = r1
            java.lang.String r1 = "a=0x%02x r=0x%02x g=0x%02x b=0x%02x"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2.append(r1)
            goto L_0x0229
        L_0x0184:
            java.lang.String r1 = "layout_direction"
            java.lang.String r3 = r0.f13093c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01af
            int r1 = r16.mo8593a()
            if (r1 == 0) goto L_0x01a8
            if (r1 == r14) goto L_0x01a5
            if (r1 == r13) goto L_0x01a2
            if (r1 == r12) goto L_0x019f
            java.lang.String r1 = java.lang.Integer.toString(r1)
            goto L_0x01aa
        L_0x019f:
            java.lang.String r1 = "LOCALE"
            goto L_0x01aa
        L_0x01a2:
            java.lang.String r1 = "INHERIT"
            goto L_0x01aa
        L_0x01a5:
            java.lang.String r1 = "RTL"
            goto L_0x01aa
        L_0x01a8:
            java.lang.String r1 = "LTR"
        L_0x01aa:
            r2.append(r1)
            goto L_0x0229
        L_0x01af:
            int r1 = r16.mo8593a()
            r2.append(r1)
            goto L_0x0229
        L_0x01b7:
            java.lang.Object r1 = r0.f13094d
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r2.append(r1)
            goto L_0x0229
        L_0x01bf:
            r1 = 34
            r2.append(r1)
            java.lang.Object r3 = r0.f13094d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.append(r3)
            r2.append(r1)
            goto L_0x0229
        L_0x01cf:
            androidx.slice.Slice r4 = r16.mo8596d()
            java.lang.Object r5 = r0.f13094d
            java.lang.String r6 = "Object must be non-null for FORMAT_ACTION"
            androidx.core.p097i.C1969d.m5306a(r5, r6)
            androidx.core.p097i.C1969d.m5306a(r4, r15)
            java.lang.Object r4 = r0.f13094d
            androidx.core.i.e r4 = (androidx.core.p097i.C1970e) r4
            java.lang.Object r4 = r4.f5888a
            r5 = 91
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "] {\n"
            r2.append(r4)
            androidx.slice.Slice r4 = r16.mo8596d()
            java.lang.String r3 = r4.mo8591a(r3)
            r2.append(r3)
            r4 = 10
            r2.append(r4)
            r2.append(r1)
            r5 = 125(0x7d, float:1.75E-43)
            r2.append(r5)
            goto L_0x0229
        L_0x0209:
            r4 = 10
            r5 = 125(0x7d, float:1.75E-43)
            androidx.slice.Slice r6 = r16.mo8596d()
            androidx.core.p097i.C1969d.m5306a(r6, r15)
            java.lang.String r7 = "{\n"
            r2.append(r7)
            java.lang.String r3 = r6.mo8591a(r3)
            r2.append(r3)
            r2.append(r4)
            r2.append(r1)
            r2.append(r5)
        L_0x0229:
            java.lang.String r1 = "\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceItem.mo8598f(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public final boolean mo8599g(Context context, Intent intent) {
        C1969d.m5306a(this.f13094d, "Object must be non-null for FORMAT_ACTION");
        Object obj = ((C1970e) this.f13094d).f5888a;
        if (obj instanceof PendingIntent) {
            ((PendingIntent) obj).send(context, 0, intent, (PendingIntent.OnFinished) null, (Handler) null);
            return false;
        }
        ((C4108g) obj).mo8611a();
        return true;
    }

    /* renamed from: h */
    public final boolean mo8600h(String... strArr) {
        for (String a : strArr) {
            if (C4093a.m11737a(this.f13091a, a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return mo8598f(BuildConfig.FLAVOR);
    }

    public SliceItem(Object obj, String str, String str2, List list) {
        this(obj, str, str2, (String[]) list.toArray(new String[list.size()]));
    }
}
