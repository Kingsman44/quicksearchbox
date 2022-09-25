package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c;

import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.keyboard.switching.ActiveKeyboardFinder$getActiveKeyboardInfo$2", mo61344c = "ActiveKeyboardFinder.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.b */
/* compiled from: PG */
final class C125906b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C125908c f346989a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125906b(C125908c cVar, C69577g gVar) {
        super(2, gVar);
        this.f346989a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125906b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        String string = Settings.Secure.getString(this.f346989a.f346992a, "default_input_method");
        List<InputMethodInfo> enabledInputMethodList = this.f346989a.f346993b.getEnabledInputMethodList();
        C69664n.m101060f(enabledInputMethodList, "inputMethodManager.enabledInputMethodList");
        for (T next : enabledInputMethodList) {
            if (C69664n.m101066l(((InputMethodInfo) next).getId(), string)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125906b(this.f346989a, gVar);
    }
}
