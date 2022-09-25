package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.at */
/* compiled from: PG */
public final class C3821at {

    /* renamed from: a */
    public final Uri f12343a;

    /* renamed from: b */
    public final String f12344b;

    /* renamed from: c */
    public final String f12345c;

    public C3821at(Intent intent) {
        C69664n.m101061g(intent, "intent");
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f12343a = data;
        this.f12344b = action;
        this.f12345c = type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        if (this.f12343a != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(this.f12343a));
        }
        if (this.f12344b != null) {
            sb.append(" action=");
            sb.append(this.f12344b);
        }
        if (this.f12345c != null) {
            sb.append(" mimetype=");
            sb.append(this.f12345c);
        }
        sb.append(" }");
        return sb.toString();
    }
}
