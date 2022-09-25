package com.google.android.apps.gsa.shared.p7038f.p7039a;

import android.content.pm.ShortcutInfo;
import android.os.Build;
import com.google.assistant.p3825an.p3830c.p3831a.C49274at;
import com.google.assistant.p3825an.p3830c.p3831a.C49275au;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3825an.p3830c.p3831a.C49329f;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.f.a.k */
/* compiled from: PG */
public final /* synthetic */ class C89751k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C89751k f242935a = new C89751k();

    private /* synthetic */ C89751k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
        if (shortcutInfo == null) {
            return Optional.empty();
        }
        C49329f fVar = (C49329f) C49330g.f127488o.createBuilder();
        String str = shortcutInfo.getPackage();
        fVar.copyOnWrite();
        C49330g gVar = (C49330g) fVar.instance;
        str.getClass();
        gVar.f127490a |= 1;
        gVar.f127491b = str;
        String id = shortcutInfo.getId();
        fVar.copyOnWrite();
        C49330g gVar2 = (C49330g) fVar.instance;
        id.getClass();
        gVar2.f127490a |= 32;
        gVar2.f127496g = id;
        C49274at atVar = (C49274at) C49275au.f127371c.createBuilder();
        String id2 = shortcutInfo.getId();
        atVar.copyOnWrite();
        C49275au auVar = (C49275au) atVar.instance;
        id2.getClass();
        auVar.f127373a = 1;
        auVar.f127374b = id2;
        fVar.copyOnWrite();
        C49330g gVar3 = (C49330g) fVar.instance;
        C49275au auVar2 = (C49275au) atVar.build();
        auVar2.getClass();
        gVar3.f127495f = auVar2;
        gVar3.f127490a |= 16;
        int i = ((Build.VERSION.SDK_INT < 30 || !shortcutInfo.isCached()) && !shortcutInfo.isDynamic()) ? 3 : 4;
        fVar.copyOnWrite();
        C49330g gVar4 = (C49330g) fVar.instance;
        gVar4.f127498i = C49279ay.m85401a(i);
        gVar4.f127490a |= 128;
        fVar.copyOnWrite();
        C49330g gVar5 = (C49330g) fVar.instance;
        gVar5.f127499j = C49277aw.m85399a(3);
        gVar5.f127490a |= 256;
        CharSequence shortLabel = shortcutInfo.getShortLabel();
        CharSequence longLabel = shortcutInfo.getLongLabel();
        if (shortLabel != null) {
            String obj2 = shortLabel.toString();
            fVar.copyOnWrite();
            C49330g gVar6 = (C49330g) fVar.instance;
            obj2.getClass();
            gVar6.f127490a |= 2;
            gVar6.f127492c = obj2;
        }
        if (longLabel != null) {
            String obj3 = longLabel.toString();
            fVar.copyOnWrite();
            C49330g gVar7 = (C49330g) fVar.instance;
            obj3.getClass();
            gVar7.f127490a |= 4;
            gVar7.f127493d = obj3;
        }
        return Optional.m71637of((C49330g) fVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
