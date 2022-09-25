package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentContainerView;
import android.support.p031v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0823s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.navigation.C3807af;
import androidx.navigation.C3809ah;
import androidx.navigation.C3836bd;
import androidx.navigation.C3863cd;
import androidx.navigation.C3868ci;
import androidx.navigation.C3870ck;
import androidx.navigation.C3873cn;
import androidx.navigation.C3892m;
import androidx.navigation.NavBackStackEntryState;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69530n;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69653c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.fragment.h */
/* compiled from: PG */
public final class C3884h extends Fragment {

    /* renamed from: a */
    public C3836bd f12461a;

    /* renamed from: b */
    private Boolean f12462b;

    /* renamed from: c */
    private View f12463c;

    /* renamed from: d */
    private int f12464d;

    /* renamed from: e */
    private boolean f12465e;

    /* renamed from: b */
    private final int m11186b() {
        int id = getId();
        return (id == 0 || id == -1) ? R.id.nav_host_fragment_container : id;
    }

    /* renamed from: a */
    public final C3807af mo8129a() {
        C3836bd bdVar = this.f12461a;
        if (bdVar != null) {
            return bdVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public final void onAttach(Context context) {
        C69664n.m101061g(context, "context");
        super.onAttach(context);
        if (this.f12465e) {
            C0154a aVar = new C0154a(getParentFragmentManager());
            aVar.mo518o(this);
            aVar.mo505b(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        C2384o lifecycle;
        Context requireContext = requireContext();
        C69664n.m101060f(requireContext, "requireContext()");
        C3836bd bdVar = new C3836bd(requireContext);
        this.f12461a = bdVar;
        C69664n.m101058d(bdVar);
        if (!C69664n.m101066l(this, bdVar.f12296j)) {
            C2391v vVar = bdVar.f12296j;
            if (!(vVar == null || (lifecycle = vVar.getLifecycle()) == null)) {
                lifecycle.mo5791c(bdVar.f12300n);
            }
            bdVar.f12296j = this;
            getLifecycle().mo5790b(bdVar.f12300n);
        }
        if (requireContext instanceof C0823s) {
            C3836bd bdVar2 = this.f12461a;
            C69664n.m101058d(bdVar2);
            OnBackPressedDispatcher gz = ((C0823s) requireContext).mo535gz();
            C69664n.m101060f(gz, "context as OnBackPressed…).onBackPressedDispatcher");
            C69664n.m101061g(gz, "dispatcher");
            C69664n.m101061g(gz, "dispatcher");
            if (!C69664n.m101066l(gz, bdVar2.f12297k)) {
                C2391v vVar2 = bdVar2.f12296j;
                if (vVar2 != null) {
                    bdVar2.f12301o.mo3351b();
                    bdVar2.f12297k = gz;
                    gz.mo3339b(vVar2, bdVar2.f12301o);
                    C2384o lifecycle2 = vVar2.getLifecycle();
                    lifecycle2.mo5791c(bdVar2.f12300n);
                    lifecycle2.mo5790b(bdVar2.f12300n);
                } else {
                    throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
                }
            }
        }
        C3836bd bdVar3 = this.f12461a;
        C69664n.m101058d(bdVar3);
        Boolean bool = this.f12462b;
        int i = 0;
        bdVar3.f12302p = bool != null && bool.booleanValue();
        bdVar3.mo8057q();
        Bundle bundle3 = null;
        this.f12462b = null;
        C3836bd bdVar4 = this.f12461a;
        C69664n.m101058d(bdVar4);
        C2370br viewModelStore = getViewModelStore();
        C69664n.m101060f(viewModelStore, "viewModelStore");
        C69664n.m101061g(viewModelStore, "viewModelStore");
        C69664n.m101061g(viewModelStore, "viewModelStore");
        if (!C69664n.m101066l(bdVar4.f12298l, C3809ah.m11023a(viewModelStore))) {
            if (bdVar4.f12292f.isEmpty()) {
                bdVar4.f12298l = C3809ah.m11023a(viewModelStore);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call");
            }
        }
        C3836bd bdVar5 = this.f12461a;
        C69664n.m101058d(bdVar5);
        C69664n.m101061g(bdVar5, "navHostController");
        C69664n.m101061g(bdVar5, "navController");
        C3870ck ckVar = bdVar5.f12303q;
        Context requireContext2 = requireContext();
        C69664n.m101060f(requireContext2, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "childFragmentManager");
        ckVar.mo8124b(new C3879c(requireContext2, childFragmentManager));
        C3870ck ckVar2 = bdVar5.f12303q;
        Context requireContext3 = requireContext();
        C69664n.m101060f(requireContext3, "requireContext()");
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        C69664n.m101060f(childFragmentManager2, "childFragmentManager");
        ckVar2.mo8124b(new C3882f(requireContext3, childFragmentManager2, m11186b()));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f12465e = true;
                C0154a aVar = new C0154a(getParentFragmentManager());
                aVar.mo518o(this);
                aVar.mo505b(false);
            }
            this.f12464d = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            C3836bd bdVar6 = this.f12461a;
            C69664n.m101058d(bdVar6);
            bundle2.setClassLoader(bdVar6.f12287a.getClassLoader());
            bdVar6.f12289c = bundle2.getBundle("android-support-nav:controller:navigatorState");
            bdVar6.f12290d = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            bdVar6.f12295i.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = intArray[i2];
                    i2++;
                    bdVar6.f12294h.put(Integer.valueOf(i4), stringArrayList.get(i3));
                    i3++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray(C69664n.m101057c("android-support-nav:controller:backStackStates:", str));
                    if (parcelableArray != null) {
                        Map map = bdVar6.f12295i;
                        C69664n.m101060f(str, "id");
                        C69530n nVar = new C69530n(parcelableArray.length);
                        Iterator a = C69653c.m101040a(parcelableArray);
                        while (a.hasNext()) {
                            Parcelable parcelable = (Parcelable) a.next();
                            if (parcelable != null) {
                                nVar.mo61321j((NavBackStackEntryState) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        map.put(str, nVar);
                    }
                }
            }
            bdVar6.f12291e = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f12464d != 0) {
            C3836bd bdVar7 = this.f12461a;
            C69664n.m101058d(bdVar7);
            bdVar7.mo8055o(bdVar7.mo8048h().mo8098a(this.f12464d), (Bundle) null);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("android-support-nav:fragment:graphId");
            }
            if (arguments != null) {
                bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i != 0) {
                C3836bd bdVar8 = this.f12461a;
                C69664n.m101058d(bdVar8);
                bdVar8.mo8055o(bdVar8.mo8048h().mo8098a(i), bundle3);
            }
        }
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C69664n.m101061g(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C69664n.m101060f(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(m11186b());
        return fragmentContainerView;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f12463c;
        if (view != null && C3863cd.m11146a(view) == this.f12461a) {
            C3863cd.m11147b(view, (C3807af) null);
        }
        this.f12463c = null;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3873cn.f12440b);
        C69664n.m101060f(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f12464d = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C3885i.f12468c);
        C69664n.m101060f(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f12465e = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public final void onPrimaryNavigationFragmentChanged(boolean z) {
        C3836bd bdVar = this.f12461a;
        if (bdVar != null) {
            bdVar.f12302p = z;
            bdVar.mo8057q();
            return;
        }
        this.f12462b = Boolean.valueOf(z);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        C69664n.m101061g(bundle, "outState");
        C3836bd bdVar = this.f12461a;
        C69664n.m101058d(bdVar);
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : C69505av.m100875q(bdVar.f12303q.f12431b).entrySet()) {
            String str = (String) entry.getKey();
            Bundle e = ((C3868ci) entry.getValue()).mo8119e();
            if (e != null) {
                arrayList.add(str);
                bundle3.putBundle(str, e);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!bdVar.f12292f.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            C69530n nVar = bdVar.f12292f;
            Parcelable[] parcelableArr = new Parcelable[nVar.f185946a];
            Iterator it = nVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState((C3892m) it.next());
                i++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!bdVar.f12294h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[bdVar.f12294h.size()];
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry2 : bdVar.f12294h.entrySet()) {
                iArr[i2] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i2++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!bdVar.f12295i.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : bdVar.f12295i.entrySet()) {
                String str2 = (String) entry3.getKey();
                C69530n nVar2 = (C69530n) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[nVar2.f185946a];
                int i3 = 0;
                for (Object next : nVar2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C69540x.m100952j();
                    }
                    parcelableArr2[i3] = (NavBackStackEntryState) next;
                    i3 = i4;
                }
                bundle2.putParcelableArray(C69664n.m101057c("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (bdVar.f12291e) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", bdVar.f12291e);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f12465e) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i5 = this.f12464d;
        if (i5 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i5);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C69664n.m101061g(view, "view");
        if (view instanceof ViewGroup) {
            C3863cd.m11147b(view, this.f12461a);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f12463c = view2;
                    C69664n.m101058d(view2);
                    if (view2.getId() == getId()) {
                        View view3 = this.f12463c;
                        C69664n.m101058d(view3);
                        C3863cd.m11147b(view3, this.f12461a);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }
}
