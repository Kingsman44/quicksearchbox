package com.google.android.libraries.elements.p1708c.p1709a;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.p5165a.C66016d;
import java.util.ArrayDeque;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.c.a.g */
/* compiled from: PG */
public final class C20726g implements C21312s {

    /* renamed from: a */
    public final C58833ax f58041a;

    public C20726g(C58833ax axVar) {
        this.f58041a = axVar;
    }

    /* renamed from: d */
    public static View m38914d(String str, View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.pollFirst();
            if (view2 != null) {
                if (str.equals(view2.getTag(R.id.elements_accessibility_view_tag_id))) {
                    return view2;
                }
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayDeque.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66016d.f179533d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C66016d dVar = (C66016d) obj;
        View b = rVar.mo26732b() != null ? rVar.mo26732b() : rVar.mo26731a();
        if (b == null) {
            return C69794a.m101254f(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((dVar.f179535a & 1) == 0 || dVar.f179536b.isEmpty()) {
            return C69794a.m101254f(new IllegalArgumentException("No accessibility identifier has been provided."));
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) b.getContext().getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return C69794a.m101255g(new C20724e(this, dVar, b));
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar2 = C70101a.f186847o;
        return aVar;
    }
}
