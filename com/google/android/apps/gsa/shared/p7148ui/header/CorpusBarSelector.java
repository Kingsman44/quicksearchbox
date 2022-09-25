package com.google.android.apps.gsa.shared.p7148ui.header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.apps.gsa.shared.ui.header.CorpusBarSelector */
/* compiled from: PG */
public class CorpusBarSelector extends LinearLayout {

    /* renamed from: a */
    static final C58495hd f253616a;

    /* renamed from: d */
    private static final C59071e f253617d = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.header.CorpusBarSelector");

    /* renamed from: b */
    public Corpus f253618b;

    /* renamed from: c */
    View f253619c;

    /* renamed from: e */
    private final Rect f253620e = new Rect();

    /* renamed from: f */
    private Typeface f253621f;

    /* renamed from: g */
    private Typeface f253622g;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("corpus_name_intent_flights", Integer.valueOf(R.string.corpus_name_intent_flights));
        gzVar.mo55429h("corpus_name_intent_maps", Integer.valueOf(R.string.corpus_name_intent_maps));
        gzVar.mo55429h("corpus_name_ipa_personal", Integer.valueOf(R.string.corpus_name_ipa_personal));
        gzVar.mo55429h("corpus_name_websearch", Integer.valueOf(R.string.corpus_name_websearch));
        gzVar.mo55429h("corpus_name_websearch_books", Integer.valueOf(R.string.corpus_name_websearch_books));
        gzVar.mo55429h("corpus_name_websearch_images", Integer.valueOf(R.string.corpus_name_websearch_images));
        gzVar.mo55429h("corpus_name_websearch_nearby", Integer.valueOf(R.string.corpus_name_websearch_nearby));
        gzVar.mo55429h("corpus_name_websearch_news", Integer.valueOf(R.string.corpus_name_websearch_news));
        gzVar.mo55429h("corpus_name_websearch_videos", Integer.valueOf(R.string.corpus_name_websearch_videos));
        gzVar.mo55429h("corpus_name_websearch_shopping", Integer.valueOf(R.string.corpus_name_websearch_shopping));
        f253616a = gzVar.mo55427f(false);
    }

    public CorpusBarSelector(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static String m148067a(Context context, Corpus corpus) {
        if (corpus == null) {
            return null;
        }
        Resources resources = context.getResources();
        Uri uri = corpus.f252916g;
        if (uri == null) {
            C59104x d = f253617d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.CorpusBar");
            ((C59052c) ((C59052c) d).mo56372aa(11264)).mo56389s("Couldn't get name for corpus %s", corpus);
            return null;
        }
        if ("com.google.android.googlequicksearchbox".equals(uri.getAuthority()) && uri.getPathSegments().size() == 2) {
            Integer num = (Integer) f253616a.get(uri.getPathSegments().get(1));
            if (num != null) {
                return resources.getString(num.intValue());
            }
        }
        try {
            Pair k = C90772bp.m148303k(context, uri);
            return ((Resources) k.first).getString(((Integer) k.second).intValue());
        } catch (Resources.NotFoundException | FileNotFoundException e) {
            C59104x d2 = f253617d.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.CorpusBar");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(11263)).mo56389s("Couldn't get name for corpus %s", corpus);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo84989b(View view) {
        if (getParent().isLayoutRequested()) {
            this.f253619c = view;
            return;
        }
        this.f253620e.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRectToMyCoords(view, this.f253620e);
        int width = (((ViewGroup) getParent()).getWidth() - view.getWidth()) / 2;
        Rect rect = this.f253620e;
        rect.left = Math.max(0, rect.left - width);
        this.f253620e.right = Math.min(getWidth(), this.f253620e.right + width);
        getParent().requestChildRectangleOnScreen(this, this.f253620e, false);
    }

    /* renamed from: c */
    public final void mo84990c(TextView textView) {
        if (this.f253621f == null) {
            this.f253621f = Typeface.create(textView.getTypeface(), 0);
        }
        if (this.f253622g == null) {
            this.f253622g = Typeface.create(textView.getTypeface(), 1);
        }
        textView.setTypeface(textView.isSelected() ? this.f253622g : this.f253621f);
    }

    /* renamed from: d */
    public final void mo84991d(Corpus corpus) {
        View findViewWithTag;
        C58976aa aaVar = C58975e.f156826a;
        if (corpus != null) {
            Corpus corpus2 = this.f253618b;
            if (!(corpus2 == null || (findViewWithTag = findViewWithTag(corpus2)) == null)) {
                findViewWithTag.setSelected(false);
                if (findViewWithTag instanceof TextView) {
                    mo84990c((TextView) findViewWithTag);
                }
            }
            this.f253618b = corpus;
            View findViewWithTag2 = findViewWithTag(corpus);
            if (findViewWithTag2 != null) {
                findViewWithTag2.setSelected(true);
                if (findViewWithTag2 instanceof TextView) {
                    mo84990c((TextView) findViewWithTag2);
                }
                mo84989b(findViewWithTag2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f253619c;
        if (view != null) {
            this.f253619c = null;
            post(new C90688a(this, view));
        }
    }

    public CorpusBarSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CorpusBarSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
