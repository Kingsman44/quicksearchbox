package androidx.core.app;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: androidx.core.app.ad */
/* compiled from: PG */
public final class C1787ad {

    /* renamed from: a */
    public final CharSequence f5568a;

    /* renamed from: b */
    public final long f5569b;

    /* renamed from: c */
    public final C1803at f5570c;

    /* renamed from: d */
    public String f5571d;

    /* renamed from: e */
    public Uri f5572e;

    /* renamed from: f */
    private final Bundle f5573f = new Bundle();

    public C1787ad(CharSequence charSequence, long j, C1803at atVar) {
        this.f5568a = charSequence;
        this.f5569b = j;
        this.f5570c = atVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List m4915c(android.os.Parcelable[] r18) {
        /*
            r0 = r18
            java.lang.String r1 = "uri"
            java.lang.String r2 = "extras"
            java.lang.String r3 = "type"
            java.lang.String r4 = "sender"
            java.lang.String r5 = "sender_person"
            java.lang.String r6 = "person"
            java.lang.String r7 = "time"
            java.lang.String r8 = "text"
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r0.length
            r9.<init>(r10)
            r10 = 0
        L_0x0019:
            int r11 = r0.length
            if (r10 >= r11) goto L_0x00c6
            r11 = r0[r10]
            boolean r12 = r11 instanceof android.os.Bundle
            if (r12 == 0) goto L_0x00ba
            android.os.Bundle r11 = (android.os.Bundle) r11
            r12 = 0
            boolean r13 = r11.containsKey(r8)     // Catch:{ ClassCastException -> 0x00af }
            if (r13 == 0) goto L_0x00aa
            boolean r13 = r11.containsKey(r7)     // Catch:{ ClassCastException -> 0x00af }
            if (r13 != 0) goto L_0x0033
            goto L_0x00aa
        L_0x0033:
            boolean r13 = r11.containsKey(r6)     // Catch:{ ClassCastException -> 0x00af }
            if (r13 == 0) goto L_0x0044
            android.os.Bundle r13 = r11.getBundle(r6)     // Catch:{ ClassCastException -> 0x0042 }
            androidx.core.app.at r13 = androidx.core.app.C1803at.m4957a(r13)     // Catch:{ ClassCastException -> 0x0042 }
            goto L_0x006e
        L_0x0042:
            goto L_0x00aa
        L_0x0044:
            boolean r13 = r11.containsKey(r5)     // Catch:{ ClassCastException -> 0x00af }
            if (r13 == 0) goto L_0x0055
            android.os.Parcelable r13 = r11.getParcelable(r5)     // Catch:{ ClassCastException -> 0x0042 }
            android.app.Person r13 = (android.app.Person) r13     // Catch:{ ClassCastException -> 0x0042 }
            androidx.core.app.at r13 = androidx.core.app.C1801ar.m4956b(r13)     // Catch:{ ClassCastException -> 0x0042 }
            goto L_0x006e
        L_0x0055:
            boolean r13 = r11.containsKey(r4)     // Catch:{ ClassCastException -> 0x00af }
            if (r13 == 0) goto L_0x006d
            androidx.core.app.as r13 = new androidx.core.app.as     // Catch:{ ClassCastException -> 0x0042 }
            r13.<init>()     // Catch:{ ClassCastException -> 0x0042 }
            java.lang.CharSequence r14 = r11.getCharSequence(r4)     // Catch:{ ClassCastException -> 0x0042 }
            r13.f5624a = r14     // Catch:{ ClassCastException -> 0x0042 }
            androidx.core.app.at r14 = new androidx.core.app.at     // Catch:{ ClassCastException -> 0x0042 }
            r14.<init>(r13)     // Catch:{ ClassCastException -> 0x0042 }
            r13 = r14
            goto L_0x006e
        L_0x006d:
            r13 = r12
        L_0x006e:
            androidx.core.app.ad r14 = new androidx.core.app.ad     // Catch:{ ClassCastException -> 0x00af }
            java.lang.CharSequence r15 = r11.getCharSequence(r8)     // Catch:{ ClassCastException -> 0x00af }
            r16 = r4
            r17 = r5
            long r4 = r11.getLong(r7)     // Catch:{ ClassCastException -> 0x00b3 }
            r14.<init>(r15, r4, r13)     // Catch:{ ClassCastException -> 0x00b3 }
            boolean r4 = r11.containsKey(r3)     // Catch:{ ClassCastException -> 0x00b3 }
            if (r4 == 0) goto L_0x0099
            boolean r4 = r11.containsKey(r1)     // Catch:{ ClassCastException -> 0x00b3 }
            if (r4 == 0) goto L_0x0099
            java.lang.String r4 = r11.getString(r3)     // Catch:{ ClassCastException -> 0x00b3 }
            android.os.Parcelable r5 = r11.getParcelable(r1)     // Catch:{ ClassCastException -> 0x00b3 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ ClassCastException -> 0x00b3 }
            r14.f5571d = r4     // Catch:{ ClassCastException -> 0x00b3 }
            r14.f5572e = r5     // Catch:{ ClassCastException -> 0x00b3 }
        L_0x0099:
            boolean r4 = r11.containsKey(r2)     // Catch:{ ClassCastException -> 0x00b3 }
            if (r4 == 0) goto L_0x00a8
            android.os.Bundle r4 = r14.f5573f     // Catch:{ ClassCastException -> 0x00b3 }
            android.os.Bundle r5 = r11.getBundle(r2)     // Catch:{ ClassCastException -> 0x00b3 }
            r4.putAll(r5)     // Catch:{ ClassCastException -> 0x00b3 }
        L_0x00a8:
            r12 = r14
            goto L_0x00b4
        L_0x00aa:
            r16 = r4
            r17 = r5
            goto L_0x00b4
        L_0x00af:
            r16 = r4
            r17 = r5
        L_0x00b3:
        L_0x00b4:
            if (r12 == 0) goto L_0x00be
            r9.add(r12)
            goto L_0x00be
        L_0x00ba:
            r16 = r4
            r17 = r5
        L_0x00be:
            int r10 = r10 + 1
            r4 = r16
            r5 = r17
            goto L_0x0019
        L_0x00c6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C1787ad.m4915c(android.os.Parcelable[]):java.util.List");
    }

    /* renamed from: d */
    static Bundle[] m4916d(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1787ad adVar = (C1787ad) list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = adVar.f5568a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", adVar.f5569b);
            C1803at atVar = adVar.f5570c;
            if (atVar != null) {
                bundle.putCharSequence("sender", atVar.f5630a);
                bundle.putParcelable("sender_person", C1801ar.m4955a(adVar.f5570c));
            }
            String str = adVar.f5571d;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = adVar.f5572e;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", adVar.f5573f);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Notification.MessagingStyle.Message mo4993a() {
        Person person;
        C1803at atVar = this.f5570c;
        CharSequence charSequence = this.f5568a;
        long j = this.f5569b;
        if (atVar == null) {
            person = null;
        } else {
            person = C1801ar.m4955a(atVar);
        }
        Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(charSequence, j, person);
        String str = this.f5571d;
        if (str != null) {
            message.setData(str, this.f5572e);
        }
        return message;
    }

    @Deprecated
    /* renamed from: b */
    public final CharSequence mo4994b() {
        C1803at atVar = this.f5570c;
        if (atVar == null) {
            return null;
        }
        return atVar.f5630a;
    }
}
