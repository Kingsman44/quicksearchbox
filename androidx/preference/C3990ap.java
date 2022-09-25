package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.preference.ap */
/* compiled from: PG */
public final class C3990ap extends C0640fb implements C4022r, C3985ak {

    /* renamed from: a */
    public List f12820a;

    /* renamed from: b */
    private final PreferenceGroup f12821b;

    /* renamed from: c */
    private List f12822c;

    /* renamed from: d */
    private final List f12823d;

    /* renamed from: e */
    private final Handler f12824e;

    /* renamed from: f */
    private final Runnable f12825f = new C3987am(this);

    public C3990ap(PreferenceGroup preferenceGroup) {
        this.f12821b = preferenceGroup;
        this.f12824e = new Handler(Looper.getMainLooper());
        preferenceGroup.f12720F = this;
        this.f12822c = new ArrayList();
        this.f12820a = new ArrayList();
        this.f12823d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).f12764e);
        } else {
            setHasStableIds(true);
        }
        mo8427e();
    }

    /* renamed from: f */
    private final List m11498f(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int j = preferenceGroup.mo8381j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            Preference o = preferenceGroup.mo8383o(i2);
            if (o.f12754z) {
                if (!m11500h(preferenceGroup) || i < preferenceGroup.f12758d) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (!(o instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.mo8378ae()) {
                        continue;
                    } else if (!m11500h(preferenceGroup) || !m11500h(preferenceGroup2)) {
                        for (Preference preference : m11498f(preferenceGroup2)) {
                            if (!m11500h(preferenceGroup) || i < preferenceGroup.f12758d) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (m11500h(preferenceGroup) && i > preferenceGroup.f12758d) {
            C4012h hVar = new C4012h(preferenceGroup.f12738j, arrayList2, preferenceGroup.mo8363fn());
            hVar.f12743o = new C3988an(this, preferenceGroup);
            arrayList.add(hVar);
        }
        return arrayList;
    }

    /* renamed from: g */
    private final void m11499g(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f12756b);
        }
        int j = preferenceGroup.mo8381j();
        for (int i = 0; i < j; i++) {
            Preference o = preferenceGroup.mo8383o(i);
            list.add(o);
            C3989ao aoVar = new C3989ao(o);
            if (!this.f12823d.contains(aoVar)) {
                this.f12823d.add(aoVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.mo8378ae()) {
                    m11499g(list, preferenceGroup2);
                }
            }
            o.f12720F = this;
        }
    }

    /* renamed from: h */
    private static final boolean m11500h(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f12758d != Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final void mo8424a() {
        this.f12824e.removeCallbacks(this.f12825f);
        this.f12824e.post(this.f12825f);
    }

    /* renamed from: b */
    public final int mo8417b(Preference preference) {
        int size = this.f12820a.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.f12820a.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo8425c(String str) {
        int size = this.f12820a.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.f12820a.get(i)).f12748t)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final Preference mo8426d(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (Preference) this.f12820a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8427e() {
        for (Preference preference : this.f12822c) {
            preference.f12720F = null;
        }
        ArrayList arrayList = new ArrayList(this.f12822c.size());
        this.f12822c = arrayList;
        m11499g(arrayList, this.f12821b);
        this.f12820a = m11498f(this.f12821b);
        C3995au auVar = this.f12821b.f12739k;
        this.mObservable.mo2879a();
        for (Preference preference2 : this.f12822c) {
        }
    }

    public final int getItemCount() {
        return this.f12820a.size();
    }

    public final long getItemId(int i) {
        if (!this.mHasStableIds) {
            return -1;
        }
        return mo8426d(i).mo8363fn();
    }

    public final int getItemViewType(int i) {
        C3989ao aoVar = new C3989ao(mo8426d(i));
        int indexOf = this.f12823d.indexOf(aoVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f12823d.size();
        this.f12823d.add(aoVar);
        return size;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C3998ax axVar = (C3998ax) ghVar;
        Preference d = mo8426d(i);
        Drawable background = axVar.itemView.getBackground();
        Drawable drawable = axVar.f12844a;
        if (background != drawable) {
            C2043bi.m5530X(axVar.itemView, drawable);
        }
        TextView textView = (TextView) axVar.mo8435a(16908310);
        if (!(textView == null || axVar.f12845b == null || textView.getTextColors().equals(axVar.f12845b))) {
            textView.setTextColor(axVar.f12845b);
        }
        d.mo8313a(axVar);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3989ao aoVar = (C3989ao) this.f12823d.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C3999ay.f12849a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0678gm.m2375e().mo3100c(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(aoVar.f12817a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C2043bi.m5530X(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = aoVar.f12818b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C3998ax(inflate);
    }
}
