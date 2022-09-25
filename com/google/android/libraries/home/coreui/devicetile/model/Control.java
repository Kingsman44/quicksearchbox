package com.google.android.libraries.home.coreui.devicetile.model;

import android.app.PendingIntent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class Control {

    /* renamed from: a */
    public final String f64883a;

    /* renamed from: b */
    public final PendingIntent f64884b;

    /* renamed from: c */
    public final C23747v f64885c;

    /* renamed from: d */
    public final CharSequence f64886d;

    /* renamed from: e */
    public final CharSequence f64887e;

    /* renamed from: f */
    public final C23736k f64888f;

    /* renamed from: g */
    public final C23642d f64889g;

    /* renamed from: h */
    public final CharSequence f64890h;

    /* renamed from: i */
    public final C23735j f64891i;

    /* renamed from: j */
    private final Zone f64892j;

    /* renamed from: k */
    private final C23737l f64893k = null;

    /* renamed from: l */
    private final Icon f64894l = null;

    /* renamed from: m */
    private final ColorStateList f64895m = null;

    /* renamed from: n */
    private final Icon f64896n;

    /* renamed from: o */
    private final Icon f64897o;

    /* renamed from: p */
    private final C23740o f64898p;

    /* renamed from: q */
    private final Icon f64899q;

    /* renamed from: r */
    private final C23732g f64900r;

    /* compiled from: PG */
    public final class NoZone implements Zone {
        public static final Parcelable.Creator CREATOR = new C23733h();

        /* renamed from: a */
        public static final NoZone f64901a = new NoZone();

        private NoZone() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C69664n.m101061g(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* compiled from: PG */
    public interface Zone extends Parcelable {
    }

    public Control(String str, PendingIntent pendingIntent, C23747v vVar, CharSequence charSequence, CharSequence charSequence2, Zone zone, C23736k kVar, C23642d dVar, CharSequence charSequence3, C23735j jVar) {
        C69664n.m101061g(str, "controlId");
        C69664n.m101061g(pendingIntent, "intent");
        C69664n.m101061g(vVar, "deviceType");
        C69664n.m101061g(charSequence, "title");
        C69664n.m101061g(charSequence2, "subtitle");
        C69664n.m101061g(zone, "zone");
        C69664n.m101061g(kVar, "status");
        C69664n.m101061g(dVar, "controlTemplate");
        C69664n.m101061g(charSequence3, "statusText");
        this.f64883a = str;
        this.f64884b = pendingIntent;
        this.f64885c = vVar;
        this.f64886d = charSequence;
        this.f64887e = charSequence2;
        this.f64892j = zone;
        this.f64888f = kVar;
        this.f64889g = dVar;
        this.f64890h = charSequence3;
        this.f64896n = null;
        this.f64897o = null;
        this.f64898p = null;
        this.f64899q = null;
        this.f64900r = null;
        this.f64891i = jVar;
    }

    /* renamed from: a */
    public static /* synthetic */ Control m44219a(Control control, C23736k kVar, C23642d dVar, CharSequence charSequence, int i) {
        Control control2 = control;
        int i2 = i;
        Zone zone = null;
        String str = (i2 & 1) != 0 ? control2.f64883a : null;
        PendingIntent pendingIntent = (i2 & 2) != 0 ? control2.f64884b : null;
        C23747v vVar = (i2 & 4) != 0 ? control2.f64885c : null;
        CharSequence charSequence2 = (i2 & 8) != 0 ? control2.f64886d : null;
        CharSequence charSequence3 = (i2 & 16) != 0 ? control2.f64887e : null;
        if ((i2 & 32) != 0) {
            zone = control2.f64892j;
        }
        Zone zone2 = zone;
        C23736k kVar2 = (i2 & 512) != 0 ? control2.f64888f : kVar;
        C23642d dVar2 = (i2 & 1024) != 0 ? control2.f64889g : dVar;
        CharSequence charSequence4 = (i2 & 2048) != 0 ? control2.f64890h : charSequence;
        C23735j jVar = control2.f64891i;
        C69664n.m101061g(str, "controlId");
        C69664n.m101061g(pendingIntent, "intent");
        C69664n.m101061g(vVar, "deviceType");
        C69664n.m101061g(charSequence2, "title");
        C69664n.m101061g(charSequence3, "subtitle");
        C69664n.m101061g(zone2, "zone");
        C69664n.m101061g(kVar2, "status");
        C69664n.m101061g(dVar2, "controlTemplate");
        C69664n.m101061g(charSequence4, "statusText");
        return new Control(str, pendingIntent, vVar, charSequence2, charSequence3, zone2, kVar2, dVar2, charSequence4, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Control)) {
            return false;
        }
        Control control = (Control) obj;
        if (!C69664n.m101066l(this.f64883a, control.f64883a) || !C69664n.m101066l(this.f64884b, control.f64884b) || !C69664n.m101066l(this.f64885c, control.f64885c) || !C69664n.m101066l(this.f64886d, control.f64886d) || !C69664n.m101066l(this.f64887e, control.f64887e) || !C69664n.m101066l(this.f64892j, control.f64892j)) {
            return false;
        }
        C23737l lVar = control.f64893k;
        if (!C69664n.m101066l((Object) null, (Object) null)) {
            return false;
        }
        Icon icon = control.f64894l;
        if (!C69664n.m101066l("null", "null")) {
            return false;
        }
        ColorStateList colorStateList = control.f64895m;
        if (!C69664n.m101066l("null", "null") || this.f64888f != control.f64888f || !C69664n.m101066l(this.f64889g, control.f64889g) || !C69664n.m101066l(this.f64890h, control.f64890h)) {
            return false;
        }
        Icon icon2 = control.f64896n;
        if (!C69664n.m101066l("null", "null")) {
            return false;
        }
        Icon icon3 = control.f64897o;
        if (!C69664n.m101066l("null", "null")) {
            return false;
        }
        C23740o oVar = control.f64898p;
        if (!C69664n.m101066l((Object) null, (Object) null)) {
            return false;
        }
        Icon icon4 = control.f64899q;
        if (!C69664n.m101066l("null", "null")) {
            return false;
        }
        C23732g gVar = control.f64900r;
        return C69664n.m101066l("null", "null") && C69664n.m101066l(this.f64891i, control.f64891i);
    }

    public final int hashCode() {
        return (((((((((((((((((this.f64883a.hashCode() * 31) + this.f64884b.hashCode()) * 31) + this.f64885c.hashCode()) * 31) + this.f64886d.hashCode()) * 31) + this.f64887e.hashCode()) * 31) + this.f64892j.hashCode()) * 923521) + this.f64888f.hashCode()) * 31) + this.f64889g.hashCode()) * 31) + this.f64890h.hashCode()) * 887503681) + this.f64891i.hashCode();
    }

    public final String toString() {
        String str = this.f64883a;
        PendingIntent pendingIntent = this.f64884b;
        C23747v vVar = this.f64885c;
        CharSequence charSequence = this.f64886d;
        CharSequence charSequence2 = this.f64887e;
        Zone zone = this.f64892j;
        C23736k kVar = this.f64888f;
        C23642d dVar = this.f64889g;
        CharSequence charSequence3 = this.f64890h;
        C23735j jVar = this.f64891i;
        return "Control(controlId=" + str + ", intent=" + pendingIntent + ", deviceType=" + vVar + ", title=" + charSequence + ", subtitle=" + charSequence2 + ", zone=" + zone + ", structure=null, customIcon=null, customColor=null, status=" + kVar + ", controlTemplate=" + dVar + ", statusText=" + charSequence3 + ", badgeIcon=null, expandableIcon=null, metadata=null, actionIcon=null, actionButton=null, sizeType=" + jVar + ")";
    }
}
