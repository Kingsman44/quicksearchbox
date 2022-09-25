package com.google.android.apps.search.googleapp.compliance.p10147d;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.p395al.p417d.p418a.C8539as;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.search.googleapp.compliance.d.m */
/* compiled from: PG */
public final class C133637m {

    /* renamed from: a */
    public static final C59071e f364029a = C59071e.m91332i("com.google.android.apps.search.googleapp.compliance.d.m");

    /* renamed from: b */
    public final Executor f364030b;

    /* renamed from: c */
    public final C44065d f364031c;

    /* renamed from: d */
    public final C44041d f364032d;

    /* renamed from: e */
    public final C133665d f364033e;

    /* renamed from: f */
    public final C37215b f364034f;

    /* renamed from: g */
    private final C44074i f364035g;

    /* renamed from: h */
    private final String f364036h;

    public C133637m(Executor executor, C44065d dVar, C44074i iVar, String str, C44041d dVar2, C133665d dVar3, C37215b bVar) {
        this.f364030b = executor;
        this.f364031c = dVar;
        this.f364035g = iVar;
        this.f364036h = str;
        this.f364032d = dVar2;
        this.f364033e = dVar3;
        this.f364034f = bVar;
    }

    /* renamed from: b */
    public static C47633f m216864b(C61366ah ahVar) {
        if (ahVar.f165947c != 200) {
            ((C59052c) ((C59052c) f364029a.mo56226d()).mo56372aa(40066)).mo56387q("Request to get prefs failed with code %d", ahVar.f165947c);
            return C47633f.m84733g(C60856cj.m92899h(new C133626b("Request to get prefs failed")));
        }
        try {
            return C47633f.m84733g(C60856cj.m92900i((C8539as) C62942bv.parseFrom((C62942bv) C8539as.f29624f, Base64.decode(StandardCharsets.UTF_8.decode(ahVar.f165946b).toString().getBytes(), 8), C62921ba.m95368a())));
        } catch (C62974ct e) {
            return C47633f.m84733g(C60856cj.m92899h(e));
        }
    }

    /* renamed from: a */
    public final Uri.Builder mo111302a() {
        Uri.Builder buildUpon = Uri.parse("https://www.google.com").buildUpon();
        return !TextUtils.isEmpty(this.f364036h) ? buildUpon.authority(this.f364036h) : buildUpon;
    }

    /* renamed from: c */
    public final C47633f mo111303c() {
        return C47633f.m84733g(this.f364035g.mo47042b(C43271v.WEB_VIEW));
    }
}
