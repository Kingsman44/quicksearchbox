package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111790b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.e */
/* compiled from: PG */
public final class C111055e {

    /* renamed from: d */
    private static final C59071e f309272d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.a.e");

    /* renamed from: a */
    public final C111790b f309273a;

    /* renamed from: b */
    public final C86124t f309274b;

    /* renamed from: c */
    public final l f309275c;

    public C111055e(C111790b bVar, C86124t tVar, l lVar) {
        this.f309273a = bVar;
        this.f309274b = tVar;
        this.f309275c = lVar;
    }

    /* renamed from: a */
    public static Optional m184831a(String str, Optional optional) {
        if (TextUtils.isEmpty(str)) {
            ((C59052c) ((C59052c) f309272d.mo56226d()).mo56372aa(27053)).mo56386p("#getFulfillAndroidIntentInternal: Fulfillment url not exist.");
            return Optional.empty();
        } else if (str.startsWith("android-app://")) {
            ((C59052c) ((C59052c) f309272d.mo56226d()).mo56372aa(27052)).mo56389s("#getFulfillAndroidIntentInternal: unsupported URL starting with %s", "android-app://");
            return Optional.empty();
        } else {
            try {
                Intent parseUri = Intent.parseUri(str, 7);
                if (optional.isPresent()) {
                    parseUri.setPackage((String) optional.get());
                }
                parseUri.addFlags(268468224);
                return Optional.m71637of(parseUri);
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f309272d.mo56225c()).mo56382g(e)).mo56372aa(27051)).mo56386p("#getFulfillAndroidIntentInternal: an exception happened.");
                return Optional.empty();
            }
        }
    }
}
