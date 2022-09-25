package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62735f;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62736g;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.h */
/* compiled from: PG */
public final /* synthetic */ class C13422h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C13422h f41235a = new C13422h();

    private /* synthetic */ C13422h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63088z zVar;
        MessageNotification messageNotification = (MessageNotification) obj;
        C62735f fVar = (C62735f) C62736g.f169448h.createBuilder();
        String str = (String) messageNotification.mo39558o().orElse(BuildConfig.FLAVOR);
        fVar.copyOnWrite();
        C62736g gVar = (C62736g) fVar.instance;
        str.getClass();
        gVar.f169450a |= 4;
        gVar.f169453d = str;
        if (messageNotification.mo39557n().isPresent()) {
            zVar = C63088z.m96143E(((CharSequence) messageNotification.mo39557n().get()).toString());
        } else {
            zVar = C63088z.f170246b;
        }
        fVar.copyOnWrite();
        C62736g gVar2 = (C62736g) fVar.instance;
        zVar.getClass();
        gVar2.f169450a |= 16;
        gVar2.f169455f = zVar;
        String obj2 = messageNotification.mo39562s().toString();
        fVar.copyOnWrite();
        C62736g gVar3 = (C62736g) fVar.instance;
        obj2.getClass();
        gVar3.f169450a |= 2;
        gVar3.f169452c = obj2;
        C63042fg i = C62953e.m95484i(messageNotification.mo39561r().isPresent() ? ((Long) messageNotification.mo39561r().get()).longValue() : 0);
        fVar.copyOnWrite();
        C62736g gVar4 = (C62736g) fVar.instance;
        i.getClass();
        gVar4.f169451b = i;
        gVar4.f169450a |= 1;
        C63088z zVar2 = C63088z.f170246b;
        fVar.copyOnWrite();
        C62736g gVar5 = (C62736g) fVar.instance;
        zVar2.getClass();
        gVar5.f169450a |= 32;
        gVar5.f169456g = zVar2;
        if (!messageNotification.mo39558o().isPresent()) {
            return (C62736g) fVar.build();
        }
        String str2 = (String) messageNotification.mo39558o().get();
        if ((str2.equals("broadcast/assistant_server_audio") || str2.equals("family_broadcast/assistant_server_audio") || str2.equals("audio")) && messageNotification.mo39552i().isPresent() && !((Uri) messageNotification.mo39552i().get()).toString().isEmpty()) {
            String uri = ((Uri) messageNotification.mo39552i().get()).toString();
            fVar.copyOnWrite();
            C62736g gVar6 = (C62736g) fVar.instance;
            uri.getClass();
            gVar6.f169450a |= 8;
            gVar6.f169454e = uri;
        }
        return (C62736g) fVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
