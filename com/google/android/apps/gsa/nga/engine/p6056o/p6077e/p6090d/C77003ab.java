package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76605q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ab */
/* compiled from: PG */
final class C77003ab {

    /* renamed from: a */
    public static final C58528ij f212547a = C58528ij.m90015O("com.google.android.apps.fireball", "com.bbm", "com.google.verificationdemo.chatdemoapp", "com.google.android.apps.googlevoice", "com.google.android.talk", "com.linecorp.lineat.android", "com.linecorp.linelite", "com.linkedin.android", "me.nextplus.smsfreetext.phonecalls", "org.telegram.messenger", "ch.threema.app", "com.viber.voip", "com.tencent.mm");

    /* renamed from: b */
    public static final C58528ij f212548b = C58528ij.m90015O("messenger.chat.social.messenger", "com.bumble.app", "com.coffeemeetsbagel", "com.google.android.apps.tachyon", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.facebook.mlite", "com.groupme.android", "com.ftw_and_co.happn", "com.hike.chat.stickers", "co.hinge.app", "com.icq.mobile.client", "com.instagram.android", "com.kakao.talk", "com.kakao.talk.theme.simple", "kik.android", "com.microsoft.teams", "com.okcupid.okcupid", "com.oovoo", "com.pof.android", "com.skype.raider", "com.microsoft.office.lync15", "com.skype.m2", "com.skype.insiders", "com.Slack", "com.snapchat.android", "com.sgiggle.production", "com.textmeinc.textme", "com.textmeinc.textme3", "com.tinder", "com.vkontakte.android", "com.vonage.TimeToCall", "com.waplog.social", "com.waplogmatch.social");

    /* renamed from: a */
    static C58485gu m123681a(C76590bg bgVar, String str) {
        Optional g = bgVar.mo72265g(C76605q.f211852a, str);
        if (g.isPresent()) {
            return C58485gu.m89846n((df) g.get());
        }
        return bgVar.mo72260b(str, "PersonalContact", "person");
    }

    /* renamed from: b */
    static boolean m123682b(C63775d dVar) {
        return f212548b.contains(dVar.f172523d);
    }

    /* renamed from: c */
    static boolean m123683c(C58485gu guVar, Optional optional) {
        if (guVar.isEmpty()) {
            return ((Boolean) optional.flatMap(C77144y.f212900a).map(C77145z.f212901a).orElse(false)).booleanValue();
        }
        if (!Collection.EL.stream(guVar).allMatch(C77002aa.f212546a)) {
            return false;
        }
        if (!optional.isPresent()) {
            return true;
        }
        String str = (String) optional.get();
        if (!((Boolean) Optional.empty().map(C77145z.f212901a).orElse(false)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    static Optional m123684d() {
        return Optional.empty();
    }
}
