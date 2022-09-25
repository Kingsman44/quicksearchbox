package com.google.android.libraries.kids.platform.kidonboarding;

import android.net.Uri;
import com.google.android.libraries.p11026am.C147764g;
import com.google.p4215bk.p4219b.C56050j;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.regex.Pattern;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.p */
/* compiled from: PG */
public final class C24059p extends C147764g {

    /* renamed from: a */
    private final C65603f f65732a;

    public C24059p(C65603f fVar) {
        this.f65732a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29446a(String str) {
        C69664n.m101061g(str, "strippedUrl");
        for (String str2 : this.f65732a.f178307a) {
            if (Pattern.matches("^" + str2 + "$", str)) {
                return true;
            }
        }
        return C56050j.m87890a(Uri.parse(str).toString());
    }
}
