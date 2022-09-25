package androidx.core.app;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.app.ae */
/* compiled from: PG */
public final class C1788ae extends C1789af {

    /* renamed from: a */
    public final List f5574a = new ArrayList();

    /* renamed from: b */
    public C1803at f5575b;

    /* renamed from: c */
    public CharSequence f5576c;

    /* renamed from: d */
    public Boolean f5577d;

    /* renamed from: i */
    private final List f5578i = new ArrayList();

    public C1788ae() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0130 A[SYNTHETIC, Splitter:B:70:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013e A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.app.C1788ae m4919g(android.app.Notification r7) {
        /*
            android.os.Bundle r7 = r7.extras
            r0 = 0
            if (r7 != 0) goto L_0x0008
        L_0x0005:
            r1 = r0
            goto L_0x0137
        L_0x0008:
            java.lang.String r1 = "android.support.v4.app.extra.COMPAT_TEMPLATE"
            java.lang.String r1 = r7.getString(r1)
            if (r1 == 0) goto L_0x0078
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -716705180: goto L_0x0044;
                case -171946061: goto L_0x003a;
                case 912942987: goto L_0x0030;
                case 919595044: goto L_0x0026;
                case 2090799565: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x004e
        L_0x001c:
            java.lang.String r2 = "androidx.core.app.NotificationCompat$MessagingStyle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x0026:
            java.lang.String r2 = "androidx.core.app.NotificationCompat$BigTextStyle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004e
            r1 = 0
            goto L_0x004f
        L_0x0030:
            java.lang.String r2 = "androidx.core.app.NotificationCompat$InboxStyle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x003a:
            java.lang.String r2 = "androidx.core.app.NotificationCompat$BigPictureStyle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x0044:
            java.lang.String r2 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            if (r1 == 0) goto L_0x0072
            if (r1 == r6) goto L_0x006c
            if (r1 == r5) goto L_0x0066
            if (r1 == r4) goto L_0x0060
            if (r1 == r3) goto L_0x005a
            goto L_0x0078
        L_0x005a:
            androidx.core.app.ae r1 = new androidx.core.app.ae
            r1.<init>()
            goto L_0x0079
        L_0x0060:
            androidx.core.app.ab r1 = new androidx.core.app.ab
            r1.<init>()
            goto L_0x0079
        L_0x0066:
            androidx.core.app.ac r1 = new androidx.core.app.ac
            r1.<init>()
            goto L_0x0079
        L_0x006c:
            androidx.core.app.w r1 = new androidx.core.app.w
            r1.<init>()
            goto L_0x0079
        L_0x0072:
            androidx.core.app.x r1 = new androidx.core.app.x
            r1.<init>()
            goto L_0x0079
        L_0x0078:
            r1 = r0
        L_0x0079:
            if (r1 != 0) goto L_0x012c
            java.lang.String r1 = "android.selfDisplayName"
            boolean r1 = r7.containsKey(r1)
            if (r1 != 0) goto L_0x0127
            java.lang.String r1 = "android.messagingStyleUser"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x008d
            goto L_0x0127
        L_0x008d:
            java.lang.String r1 = "android.picture"
            boolean r1 = r7.containsKey(r1)
            if (r1 != 0) goto L_0x0121
            java.lang.String r1 = "android.pictureIcon"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x009f
            goto L_0x0121
        L_0x009f:
            java.lang.String r1 = "android.bigText"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x00ae
            androidx.core.app.x r1 = new androidx.core.app.x
            r1.<init>()
            goto L_0x012c
        L_0x00ae:
            java.lang.String r1 = "android.textLines"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x00bd
            androidx.core.app.ac r1 = new androidx.core.app.ac
            r1.<init>()
            goto L_0x012c
        L_0x00bd:
            java.lang.String r1 = "android.template"
            java.lang.String r1 = r7.getString(r1)
            if (r1 != 0) goto L_0x00c7
        L_0x00c5:
            r1 = r0
            goto L_0x012c
        L_0x00c7:
            java.lang.Class<android.app.Notification$BigPictureStyle> r2 = android.app.Notification.BigPictureStyle.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00d9
            androidx.core.app.w r1 = new androidx.core.app.w
            r1.<init>()
            goto L_0x012c
        L_0x00d9:
            java.lang.Class<android.app.Notification$BigTextStyle> r2 = android.app.Notification.BigTextStyle.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00eb
            androidx.core.app.x r1 = new androidx.core.app.x
            r1.<init>()
            goto L_0x012c
        L_0x00eb:
            java.lang.Class<android.app.Notification$InboxStyle> r2 = android.app.Notification.InboxStyle.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00fd
            androidx.core.app.ac r1 = new androidx.core.app.ac
            r1.<init>()
            goto L_0x012c
        L_0x00fd:
            java.lang.Class<android.app.Notification$MessagingStyle> r2 = android.app.Notification.MessagingStyle.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x010f
            androidx.core.app.ae r1 = new androidx.core.app.ae
            r1.<init>()
            goto L_0x012c
        L_0x010f:
            java.lang.Class<android.app.Notification$DecoratedCustomViewStyle> r2 = android.app.Notification.DecoratedCustomViewStyle.class
            java.lang.String r2 = r2.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c5
            androidx.core.app.ab r1 = new androidx.core.app.ab
            r1.<init>()
            goto L_0x012c
        L_0x0121:
            androidx.core.app.w r1 = new androidx.core.app.w
            r1.<init>()
            goto L_0x012c
        L_0x0127:
            androidx.core.app.ae r1 = new androidx.core.app.ae
            r1.<init>()
        L_0x012c:
            if (r1 != 0) goto L_0x0130
            goto L_0x0005
        L_0x0130:
            r1.mo4991c(r7)     // Catch:{ ClassCastException -> 0x0134 }
            goto L_0x0137
        L_0x0134:
            goto L_0x0005
        L_0x0137:
            boolean r7 = r1 instanceof androidx.core.app.C1788ae
            if (r7 == 0) goto L_0x013e
            androidx.core.app.ae r1 = (androidx.core.app.C1788ae) r1
            return r1
        L_0x013e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C1788ae.m4919g(android.app.Notification):androidx.core.app.ae");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo4986a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* renamed from: b */
    public final void mo4987b(C1830q qVar) {
        this.f5577d = Boolean.valueOf(mo4996i());
        Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(C1801ar.m4955a(this.f5575b));
        for (C1787ad a : this.f5574a) {
            messagingStyle.addMessage(a.mo4993a());
        }
        for (C1787ad a2 : this.f5578i) {
            messagingStyle.addHistoricMessage(a2.mo4993a());
        }
        this.f5577d.booleanValue();
        messagingStyle.setConversationTitle(this.f5576c);
        messagingStyle.setGroupConversation(this.f5577d.booleanValue());
        messagingStyle.setBuilder(((C1792ai) qVar).f5598b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4991c(Bundle bundle) {
        super.mo4991c(bundle);
        this.f5574a.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f5575b = C1803at.m4957a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            C1802as asVar = new C1802as();
            asVar.f5624a = bundle.getString("android.selfDisplayName");
            this.f5575b = new C1803at(asVar);
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f5576c = charSequence;
        if (charSequence == null) {
            this.f5576c = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            this.f5574a.addAll(C1787ad.m4915c(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f5578i.addAll(C1787ad.m4915c(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f5577d = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    /* renamed from: h */
    public final void mo4995h(Bundle bundle) {
        Bundle bundle2;
        super.mo4995h(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f5575b.f5630a);
        C1803at atVar = this.f5575b;
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", atVar.f5630a);
        IconCompat iconCompat = atVar.f5631b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.f5826b) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.f5827c);
                    break;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.f5827c);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.f5827c);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.f5827c);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid icon");
            }
            bundle2.putInt("type", iconCompat.f5826b);
            bundle2.putInt("int1", iconCompat.f5830f);
            bundle2.putInt("int2", iconCompat.f5831g);
            bundle2.putString("string1", iconCompat.f5835k);
            ColorStateList colorStateList = iconCompat.f5832h;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f5833i;
            if (mode != IconCompat.f5825a) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString("uri", atVar.f5632c);
        bundle3.putString("key", atVar.f5633d);
        bundle3.putBoolean("isBot", atVar.f5634e);
        bundle3.putBoolean("isImportant", atVar.f5635f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.f5576c);
        if (this.f5576c != null && this.f5577d.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f5576c);
        }
        if (!this.f5574a.isEmpty()) {
            bundle.putParcelableArray("android.messages", C1787ad.m4916d(this.f5574a));
        }
        if (!this.f5578i.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C1787ad.m4916d(this.f5578i));
        }
        Boolean bool = this.f5577d;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* renamed from: i */
    public final boolean mo4996i() {
        C1839z zVar = this.f5579e;
        if (zVar != null && zVar.f5681a.getApplicationInfo().targetSdkVersion < 28 && this.f5577d == null) {
            return this.f5576c != null;
        }
        Boolean bool = this.f5577d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: j */
    public final void mo4997j(C1787ad adVar) {
        this.f5574a.add(adVar);
        if (this.f5574a.size() > 25) {
            this.f5574a.remove(0);
        }
    }

    public C1788ae(C1803at atVar) {
        if (!TextUtils.isEmpty(atVar.f5630a)) {
            this.f5575b = atVar;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
