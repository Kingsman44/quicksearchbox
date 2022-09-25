package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13262b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16343aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53307ja;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53433ns;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C16411ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16348av f48276a;

    /* renamed from: b */
    public final /* synthetic */ int f48277b;

    public /* synthetic */ C16411ab(C16348av avVar, int i) {
        this.f48276a = avVar;
        this.f48277b = i;
    }

    public final void accept(Object obj) {
        C16348av avVar = this.f48276a;
        int i = this.f48277b;
        C13262b bVar = (C13262b) obj;
        C16343aq aqVar = (C16343aq) C16344ar.f48114e.createBuilder();
        aqVar.copyOnWrite();
        C16344ar arVar = (C16344ar) aqVar.instance;
        int i2 = i - 1;
        arVar.f48118c = i2;
        arVar.f48116a |= 2;
        C53433ns nsVar = (C53433ns) C53435nu.f140233n.createBuilder();
        String str = bVar.f40946b;
        nsVar.copyOnWrite();
        C53435nu nuVar = (C53435nu) nsVar.instance;
        str.getClass();
        nuVar.f140236a |= 2;
        nuVar.f140240e = str;
        String str2 = bVar.f40946b;
        nsVar.copyOnWrite();
        C53435nu nuVar2 = (C53435nu) nsVar.instance;
        str2.getClass();
        nuVar2.f140237b = 5;
        nuVar2.f140238c = str2;
        C16090ap apVar = C16090ap.HOME_SCREEN;
        if (i2 != 7) {
            C53307ja jaVar = (C53307ja) C53308jb.f139794f.createBuilder();
            jaVar.copyOnWrite();
            C53308jb jbVar = (C53308jb) jaVar.instance;
            jbVar.f139796a |= 4;
            jbVar.f139799d = 145528;
            C53308jb jbVar2 = (C53308jb) jaVar.build();
            nsVar.copyOnWrite();
            C53435nu nuVar3 = (C53435nu) nsVar.instance;
            jbVar2.getClass();
            nuVar3.f140246k = jbVar2;
            nuVar3.f140236a |= 512;
        } else {
            C53307ja jaVar2 = (C53307ja) C53308jb.f139794f.createBuilder();
            jaVar2.copyOnWrite();
            C53308jb jbVar3 = (C53308jb) jaVar2.instance;
            jbVar3.f139796a |= 4;
            jbVar3.f139799d = 145527;
            C53308jb jbVar4 = (C53308jb) jaVar2.build();
            nsVar.copyOnWrite();
            C53435nu nuVar4 = (C53435nu) nsVar.instance;
            jbVar4.getClass();
            nuVar4.f140246k = jbVar4;
            nuVar4.f140236a |= 512;
        }
        try {
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            String str3 = bVar.f40948d;
            C58838bb.m90869d(!str3.isEmpty(), "Contact id is empty.");
            String uri = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str3)), "photo").toString();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            uri.getClass();
            dcVar.f132815a |= 2;
            dcVar.f132817c = uri;
            C51012dc dcVar2 = (C51012dc) dbVar.build();
            nsVar.copyOnWrite();
            C53435nu nuVar5 = (C53435nu) nsVar.instance;
            dcVar2.getClass();
            nuVar5.f140244i = dcVar2;
            nuVar5.f140236a |= 32;
        } catch (IllegalArgumentException e) {
            C59104x d = C16416ag.f48286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SuggestionService");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(46713)).mo56386p("Empty contact id, contact image not set.");
        }
        C53435nu nuVar6 = (C53435nu) nsVar.build();
        aqVar.copyOnWrite();
        C16344ar arVar2 = (C16344ar) aqVar.instance;
        nuVar6.getClass();
        arVar2.f48117b = nuVar6;
        arVar2.f48116a |= 1;
        avVar.mo22891b(aqVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
