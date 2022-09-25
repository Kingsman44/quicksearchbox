package com.google.android.apps.search.googleapp.discover.channels;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class AccessibilityOrderedLayout extends C134168cc implements C47231d {

    /* renamed from: a */
    public C134138b f365298a;

    @Deprecated
    public AccessibilityOrderedLayout(Context context) {
        super(context);
        m217555d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final void m217555d() {
        if (this.f365298a == null) {
            try {
                C134172d dVar = (C134172d) mo111587a().mo17653jN();
                C134104a aVar = new C134104a(this);
                C47240i.m84036c(aVar);
                try {
                    C134138b e = dVar.mo111595e();
                    this.f365298a = e;
                    if (e == null) {
                        C47240i.m84035b(aVar);
                    }
                    this.f365298a.f365465c = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f365298a == null) {
                        C47240i.m84035b(aVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
            }
        }
    }

    public final void addChildrenForAccessibility(ArrayList arrayList) {
        List<Number> list;
        m217555d();
        C134138b bVar = this.f365298a;
        C69664n.m101061g(arrayList, "children");
        boolean z = bVar.f365407b;
        Integer valueOf = Integer.valueOf(R.id.googleapp_discover_channels_feed);
        Integer valueOf2 = Integer.valueOf(R.id.googleapp_discover_channels_header);
        if (z) {
            list = C69540x.m100947e(Integer.valueOf(R.id.googleapp_discover_channels_search_box), valueOf2, valueOf);
        } else {
            list = C69540x.m100947e(valueOf2, valueOf);
        }
        ArrayList<View> arrayList2 = new ArrayList<>(C69540x.m100804k(list, 10));
        for (Number intValue : list) {
            arrayList2.add(bVar.f365406a.findViewById(intValue.intValue()));
        }
        for (View addChildrenForAccessibility : arrayList2) {
            addChildrenForAccessibility.addChildrenForAccessibility(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4740J();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m217555d();
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C134138b bVar = this.f365298a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public AccessibilityOrderedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccessibilityOrderedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccessibilityOrderedLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AccessibilityOrderedLayout(C47274n nVar) {
        super(nVar);
        m217555d();
    }
}
