package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.bc */
/* compiled from: PG */
public final class C128498bc implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C128501bf f353383a;

    /* renamed from: b */
    final /* synthetic */ TextView f353384b;

    /* renamed from: c */
    final /* synthetic */ TextView f353385c;

    public C128498bc(C128501bf bfVar, TextView textView, TextView textView2) {
        this.f353383a = bfVar;
        this.f353384b = textView;
        this.f353385c = textView2;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C128501bf.f353389a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38876));
        cVar.mo56386p("#MWW Failed to update popup UI state.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C128543h hVar = (C128543h) obj;
        C69664n.m101061g(hVar, "data");
        if (C128495b.m209692a(hVar)) {
            TextView textView = this.f353384b;
            C62971cq cqVar = hVar.f353470e;
            C69664n.m101060f(cqVar, "data.popupPhrasesList");
            List<String> V = C69540x.m100840V(cqVar);
            ArrayList arrayList = new ArrayList(C69540x.m100804k(V, 10));
            for (String str : V) {
                C69664n.m101060f(str, "it");
                Context context = textView.getContext();
                C69664n.m101060f(context, "context");
                String string = context.getResources().getString(R.string.assistant_guacamole_popup_quoted_text, new Object[]{str});
                C69664n.m101060f(string, "context.resources.getStr…_popup_quoted_text, this)");
                SpannableStringBuilder append = new SpannableStringBuilder().append(string, new ForegroundColorSpan(C19391a.m36980a(context, R.attr.colorPrimary)), 0);
                C69664n.m101060f(append, "SpannableStringBuilder()…ontext)), /* flags= */ 0)");
                arrayList.add(append);
            }
            Object[] array = arrayList.toArray(new Spanned[0]);
            C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Spanned[] spannedArr = (Spanned[]) array;
            C58495hd hdVar = C128501bf.f353390b;
            C79570b a = C79570b.m127648a(hVar.f353468c);
            if (a == null) {
                a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            C128468a aVar = (C128468a) hdVar.get(a);
            if (aVar != null) {
                Resources resources = textView.getResources();
                C69664n.m101060f(resources, "resources");
                int i = aVar.f353326a;
                int length = spannedArr.length;
                textView.setText(C128502bg.m209703a(resources, i, (Spanned[]) Arrays.copyOf(spannedArr, length)));
                Resources resources2 = textView.getResources();
                C69664n.m101060f(resources2, "resources");
                textView.setContentDescription(C128502bg.m209703a(resources2, aVar.f353327b, (Spanned[]) Arrays.copyOf(spannedArr, length)));
            }
            C128501bf bfVar = this.f353383a;
            this.f353385c.setOnClickListener(new C47591co(bfVar.f353392d, "guacamolePopupLinkClick", new C128500be(bfVar, hVar)));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
