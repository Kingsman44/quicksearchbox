package com.google.android.apps.search.googleapp.discover.p10191i.p10192a.p10194b;

import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.C20873cx;
import com.google.protobuf.MessageLite;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4923b.p4925b.C64241b;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.discover.i.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C134363e implements C20873cx {

    /* renamed from: a */
    public final /* synthetic */ AccessibilityManager f365999a;

    /* renamed from: b */
    public final /* synthetic */ C21313t f366000b;

    public /* synthetic */ C134363e(AccessibilityManager accessibilityManager, C21313t tVar) {
        this.f365999a = accessibilityManager;
        this.f366000b = tVar;
    }

    /* renamed from: a */
    public final C6405o mo25998a(C6411u uVar, C21319z zVar, MessageLite messageLite, String str, List list) {
        AccessibilityManager accessibilityManager = this.f365999a;
        C21313t tVar = this.f366000b;
        C64241b bVar = (C64241b) messageLite;
        C134359a aVar = new C134359a();
        aVar.mo111766c(uVar, new C134361c());
        aVar.f365983a.f365995e = bVar.f173695b;
        aVar.f365984d.set(2);
        aVar.f365983a.f365988B = bVar.f173696c;
        aVar.f365984d.set(6);
        aVar.f365983a.f365994d = bVar.f173697d;
        boolean z = true;
        aVar.f365984d.set(1);
        aVar.f365983a.f365996f = bVar.f173698e;
        aVar.f365984d.set(3);
        aVar.f365983a.f365997g = bVar.f173699f;
        aVar.f365984d.set(4);
        aVar.f365983a.f365987A = bVar.f173700g;
        aVar.f365984d.set(5);
        if (accessibilityManager.isTouchExplorationEnabled() || !bVar.f173701h) {
            z = false;
        }
        aVar.f365983a.f365991a = z;
        aVar.f365984d.set(0);
        aVar.f365983a.f365989C = bVar.f173702i;
        aVar.f365984d.set(7);
        aVar.f365983a.f365990D = bVar.f173703j;
        aVar.f365984d.set(8);
        if (str != null) {
            aVar.f365983a.f365992b = str;
        }
        if ((bVar.f173694a & 512) != 0) {
            aVar.f365983a.f365993c = new C134364f(tVar, bVar);
        }
        return aVar;
    }
}
