package androidx.mediarouter.p175a;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.mediarouter.a.l */
/* compiled from: PG */
public final class C3739l {

    /* renamed from: a */
    final Bundle f12007a;

    /* renamed from: b */
    List f12008b;

    /* renamed from: c */
    List f12009c;

    public C3739l(Bundle bundle) {
        this.f12007a = bundle;
    }

    /* renamed from: l */
    public static C3739l m10837l(Bundle bundle) {
        if (bundle != null) {
            return new C3739l(bundle);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo7883a() {
        return this.f12007a.getInt("connectionState", 0);
    }

    /* renamed from: b */
    public final int mo7884b() {
        return this.f12007a.getInt("deviceType");
    }

    /* renamed from: c */
    public final int mo7885c() {
        return this.f12007a.getInt("playbackStream", -1);
    }

    /* renamed from: d */
    public final int mo7886d() {
        return this.f12007a.getInt("playbackType", 1);
    }

    /* renamed from: e */
    public final int mo7887e() {
        return this.f12007a.getInt("presentationDisplayId", -1);
    }

    /* renamed from: f */
    public final int mo7888f() {
        return this.f12007a.getInt("volume");
    }

    /* renamed from: g */
    public final int mo7889g() {
        return this.f12007a.getInt("volumeHandling", 0);
    }

    /* renamed from: h */
    public final int mo7890h() {
        return this.f12007a.getInt("volumeMax");
    }

    /* renamed from: i */
    public final IntentSender mo7891i() {
        return (IntentSender) this.f12007a.getParcelable("settingsIntent");
    }

    /* renamed from: j */
    public final Uri mo7892j() {
        String string = this.f12007a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* renamed from: k */
    public final Bundle mo7893k() {
        return this.f12007a.getBundle("extras");
    }

    /* renamed from: m */
    public final String mo7894m() {
        return this.f12007a.getString("status");
    }

    /* renamed from: n */
    public final String mo7895n() {
        return this.f12007a.getString("id");
    }

    /* renamed from: o */
    public final String mo7896o() {
        return this.f12007a.getString("name");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo7897p() {
        if (this.f12009c == null) {
            ArrayList parcelableArrayList = this.f12007a.getParcelableArrayList("controlFilters");
            this.f12009c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f12009c = Collections.emptyList();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo7898q() {
        if (this.f12008b == null) {
            ArrayList<String> stringArrayList = this.f12007a.getStringArrayList("groupMemberIds");
            this.f12008b = stringArrayList;
            if (stringArrayList == null) {
                this.f12008b = Collections.emptyList();
            }
        }
    }

    /* renamed from: r */
    public final boolean mo7899r() {
        return this.f12007a.getBoolean("canDisconnect", false);
    }

    /* renamed from: s */
    public final boolean mo7900s() {
        return this.f12007a.getBoolean("enabled", true);
    }

    /* renamed from: t */
    public final boolean mo7901t() {
        mo7897p();
        return !TextUtils.isEmpty(mo7895n()) && !TextUtils.isEmpty(mo7896o()) && !this.f12009c.contains((Object) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(mo7895n());
        sb.append(", groupMemberIds=");
        mo7898q();
        sb.append(this.f12008b);
        sb.append(", name=");
        sb.append(mo7896o());
        sb.append(", description=");
        sb.append(mo7894m());
        sb.append(", iconUri=");
        sb.append(mo7892j());
        sb.append(", isEnabled=");
        sb.append(mo7900s());
        sb.append(", connectionState=");
        sb.append(mo7883a());
        sb.append(", controlFilters=");
        mo7897p();
        sb.append(Arrays.toString(this.f12009c.toArray()));
        sb.append(", playbackType=");
        sb.append(mo7886d());
        sb.append(", playbackStream=");
        sb.append(mo7885c());
        sb.append(", deviceType=");
        sb.append(mo7884b());
        sb.append(", volume=");
        sb.append(mo7888f());
        sb.append(", volumeMax=");
        sb.append(mo7890h());
        sb.append(", volumeHandling=");
        sb.append(mo7889g());
        sb.append(", presentationDisplayId=");
        sb.append(mo7887e());
        sb.append(", extras=");
        sb.append(mo7893k());
        sb.append(", isValid=");
        sb.append(mo7901t());
        sb.append(", minClientVersion=");
        sb.append(this.f12007a.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(this.f12007a.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(" }");
        return sb.toString();
    }
}
