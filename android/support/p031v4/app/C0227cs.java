package android.support.p031v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: android.support.v4.app.cs */
/* compiled from: PG */
public class C0227cs extends Fragment {

    /* renamed from: a */
    ListAdapter f852a;

    /* renamed from: b */
    ListView f853b;

    /* renamed from: c */
    View f854c;

    /* renamed from: d */
    TextView f855d;

    /* renamed from: e */
    View f856e;

    /* renamed from: f */
    View f857f;

    /* renamed from: g */
    boolean f858g;

    /* renamed from: h */
    private final Handler f859h = new Handler();

    /* renamed from: i */
    private final Runnable f860i = new C0225cq(this);

    /* renamed from: j */
    private final AdapterView.OnItemClickListener f861j = new C0226cr(this);

    /* renamed from: c */
    private final void m542c() {
        if (this.f853b == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f853b = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.f855d = textView;
                    if (textView == null) {
                        this.f854c = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f856e = view.findViewById(16711682);
                    this.f857f = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f853b = listView;
                        View view2 = this.f854c;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f858g = true;
                this.f853b.setOnItemClickListener(this.f861j);
                ListAdapter listAdapter = this.f852a;
                if (listAdapter != null) {
                    this.f852a = null;
                    mo730a(listAdapter);
                } else if (this.f856e != null) {
                    m543d(false, false);
                }
                this.f859h.post(this.f860i);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: d */
    private final void m543d(boolean z, boolean z2) {
        m542c();
        View view = this.f856e;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f858g != z) {
            this.f858g = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f857f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f857f.clearAnimation();
                }
                this.f856e.setVisibility(8);
                this.f857f.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f857f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f857f.clearAnimation();
            }
            this.f856e.setVisibility(0);
            this.f857f.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo730a(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f852a;
        this.f852a = listAdapter;
        ListView listView = this.f853b;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f858g && listAdapter2 == null) {
                m543d(true, requireView().getWindowToken() != null);
            }
        }
    }

    /* renamed from: b */
    public void mo731b(ListView listView, int i) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onDestroyView() {
        this.f859h.removeCallbacks(this.f860i);
        this.f853b = null;
        this.f858g = false;
        this.f857f = null;
        this.f856e = null;
        this.f854c = null;
        this.f855d = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        m542c();
    }
}
