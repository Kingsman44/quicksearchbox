package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: androidx.core.app.ag */
/* compiled from: PG */
public final class C1790ag {

    /* renamed from: a */
    public ArrayList f5583a = new ArrayList();

    /* renamed from: b */
    private int f5584b = 1;

    /* renamed from: c */
    private PendingIntent f5585c;

    /* renamed from: d */
    private ArrayList f5586d = new ArrayList();

    /* renamed from: e */
    private Bitmap f5587e;

    /* renamed from: f */
    private int f5588f;

    /* renamed from: g */
    private int f5589g = 8388613;

    /* renamed from: h */
    private int f5590h = -1;

    /* renamed from: i */
    private int f5591i = 0;

    /* renamed from: j */
    private int f5592j;

    /* renamed from: k */
    private int f5593k = 80;

    /* renamed from: l */
    private int f5594l;

    /* renamed from: m */
    private String f5595m;

    /* renamed from: n */
    private String f5596n;

    public C1790ag() {
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1790ag agVar = new C1790ag();
        agVar.f5583a = new ArrayList(this.f5583a);
        agVar.f5584b = this.f5584b;
        agVar.f5585c = this.f5585c;
        agVar.f5586d = new ArrayList(this.f5586d);
        agVar.f5587e = this.f5587e;
        agVar.f5588f = this.f5588f;
        agVar.f5589g = this.f5589g;
        agVar.f5590h = this.f5590h;
        agVar.f5591i = this.f5591i;
        agVar.f5592j = this.f5592j;
        agVar.f5593k = this.f5593k;
        agVar.f5594l = this.f5594l;
        agVar.f5595m = this.f5595m;
        agVar.f5596n = this.f5596n;
        return agVar;
    }

    public C1790ag(Notification notification) {
        Notification[] notificationArr;
        Bundle bundle = notification.extras;
        Bundle bundle2 = bundle != null ? bundle.getBundle("android.wearable.EXTENSIONS") : null;
        if (bundle2 != null) {
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("actions");
            if (parcelableArrayList != null) {
                int size = parcelableArrayList.size();
                C1832s[] sVarArr = new C1832s[size];
                for (int i = 0; i < size; i++) {
                    sVarArr[i] = C1791ah.m4934b((Notification.Action) parcelableArrayList.get(i));
                }
                Collections.addAll(this.f5583a, sVarArr);
            }
            this.f5584b = bundle2.getInt("flags", 1);
            this.f5585c = (PendingIntent) bundle2.getParcelable("displayIntent");
            Parcelable[] parcelableArray = bundle2.getParcelableArray("pages");
            if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
                notificationArr = (Notification[]) parcelableArray;
            } else {
                notificationArr = new Notification[parcelableArray.length];
                for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                    notificationArr[i2] = (Notification) parcelableArray[i2];
                }
                bundle2.putParcelableArray("pages", notificationArr);
            }
            if (notificationArr != null) {
                Collections.addAll(this.f5586d, notificationArr);
            }
            this.f5587e = (Bitmap) bundle2.getParcelable("background");
            this.f5588f = bundle2.getInt("contentIcon");
            this.f5589g = bundle2.getInt("contentIconGravity", 8388613);
            this.f5590h = bundle2.getInt("contentActionIndex", -1);
            this.f5591i = bundle2.getInt("customSizePreset", 0);
            this.f5592j = bundle2.getInt("customContentHeight");
            this.f5593k = bundle2.getInt("gravity", 80);
            this.f5594l = bundle2.getInt("hintScreenTimeout");
            this.f5595m = bundle2.getString("dismissalId");
            this.f5596n = bundle2.getString("bridgeTag");
        }
    }
}
