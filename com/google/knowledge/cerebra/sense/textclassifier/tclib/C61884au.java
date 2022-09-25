package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.textclassifier.ConversationActions;
import androidx.core.app.C1803at;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.IconCompat;
import p3186j$.time.Instant;
import p3186j$.time.TimeConversions;
import p3186j$.time.ZoneOffset;
import p3186j$.util.function.Function;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.au */
/* compiled from: PG */
public final /* synthetic */ class C61884au implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C61884au f167339a = new C61884au();

    private /* synthetic */ C61884au() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61883at atVar = (C61883at) obj;
        C1803at atVar2 = atVar.f167335b;
        Person.Builder name = new Person.Builder().setName(atVar2.f5630a);
        IconCompat iconCompat = atVar2.f5631b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = C1932e.m5233b(iconCompat, (Context) null);
        }
        return new ConversationActions.Message.Builder(name.setIcon(icon).setUri(atVar2.f5632c).setKey(atVar2.f5633d).setBot(atVar2.f5634e).setImportant(atVar2.f5635f).build()).setText(atVar.f167337d).setReferenceTime(TimeConversions.convert(Instant.ofEpochMilli(atVar.f167336c.longValue()).atZone(ZoneOffset.UTC))).setExtras(atVar.f167338e).build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
