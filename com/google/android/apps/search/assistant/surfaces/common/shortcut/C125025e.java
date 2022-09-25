package com.google.android.apps.search.assistant.surfaces.common.shortcut;

import android.content.Intent;
import com.google.android.libraries.silk.p3205a.p3224m.C41727a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56740a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56741b;
import java.net.URISyntaxException;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.shortcut.e */
/* compiled from: PG */
public final class C125025e {

    /* renamed from: a */
    private static final C59071e f344951a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.common.shortcut.e");

    /* renamed from: b */
    private static final C58528ij f344952b = new C58759qy("^https://shoppinglist.google.com(($)|\\?*)");

    /* renamed from: c */
    private final ShortcutActivity f344953c;

    /* renamed from: d */
    private final C41727a f344954d;

    /* renamed from: e */
    private final boolean f344955e;

    public C125025e(ShortcutActivity shortcutActivity, C41727a aVar, boolean z) {
        this.f344953c = shortcutActivity;
        this.f344954d = aVar;
        this.f344955e = z;
    }

    /* renamed from: a */
    public final void mo106784a() {
        if (!this.f344955e) {
            ((C59052c) ((C59052c) f344951a.mo56226d()).mo56372aa(36414)).mo56386p("ShortcutActivity was called when experiment was not on.");
            this.f344953c.finish();
            return;
        }
        Intent intent = this.f344953c.getIntent();
        String stringExtra = intent.getStringExtra("shortcut_name");
        if (!C58837ba.m90859h(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("shortcut_icon_uri");
            if (!C58837ba.m90859h(stringExtra2)) {
                String stringExtra3 = intent.getStringExtra("shortcut_intent_uri_b64");
                if (!C58837ba.m90859h(stringExtra3)) {
                    String str = new String(C59326i.f157516d.mo56836k(stringExtra3), StandardCharsets.UTF_8);
                    try {
                        Intent parseUri = Intent.parseUri(str, 0);
                        if (Collection.EL.stream(f344952b).noneMatch(new C125024d(str))) {
                            parseUri.setPackage("com.google.android.googlequicksearchbox");
                        }
                        C41727a aVar = this.f344954d;
                        C56740a aVar2 = (C56740a) C56741b.f151431f.createBuilder();
                        aVar2.copyOnWrite();
                        C56741b bVar = (C56741b) aVar2.instance;
                        stringExtra.getClass();
                        bVar.f151433a |= 1;
                        bVar.f151434b = stringExtra;
                        String uri = parseUri.toUri(0);
                        aVar2.copyOnWrite();
                        C56741b bVar2 = (C56741b) aVar2.instance;
                        uri.getClass();
                        bVar2.f151433a |= 2;
                        bVar2.f151435c = uri;
                        aVar2.copyOnWrite();
                        C56741b bVar3 = (C56741b) aVar2.instance;
                        stringExtra2.getClass();
                        bVar3.f151433a |= 4;
                        bVar3.f151436d = stringExtra2;
                        C46459k.m82829b(aVar.mo42542a((C56741b) aVar2.build()), "Failed to add shortcut!", new Object[0]);
                        this.f344953c.finish();
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException("Shortcut intent could not be parsed: ", e);
                    }
                } else {
                    throw new IllegalArgumentException("Shortcut intent (i.e. action link) must not be empty");
                }
            } else {
                throw new IllegalArgumentException("Shortcut icon must not be empty");
            }
        } else {
            throw new IllegalArgumentException("Shortcut name must not be empty");
        }
    }
}
