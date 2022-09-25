package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.p124l.p125a.C2304a;
import androidx.p124l.p125a.C2305b;
import androidx.p124l.p125a.C2306c;
import androidx.p124l.p125a.C2310g;
import com.google.android.googlequicksearchbox.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.social.licenses.e */
/* compiled from: PG */
public final class C41957e extends Fragment implements C2304a {

    /* renamed from: a */
    public ArrayAdapter f109509a;

    /* renamed from: b */
    public C41956d f109510b;

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C41956d) {
            this.f109510b = (C41956d) parentFragment;
            return;
        }
        C0167am activity = getActivity();
        if (activity instanceof C41956d) {
            this.f109510b = (C41956d) activity;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        C2305b a = C2305b.m6238a(getActivity());
        C2310g gVar = (C2310g) a;
        if (gVar.f6463b.f6461c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (C2310g.m6251b(2)) {
                Log.v("LoaderManager", "destroyLoader in " + a + " of 54321");
            }
            C2306c a2 = gVar.f6463b.mo5684a();
            if (a2 != null) {
                a2.mo5680n();
                gVar.f6463b.f6460b.mo3731j(54321);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    public final void onDetach() {
        super.onDetach();
        this.f109510b = null;
    }

    /* JADX INFO: finally extract failed */
    public final void onViewCreated(View view, Bundle bundle) {
        C0167am activity = getActivity();
        this.f109509a = new ArrayAdapter(activity, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        C2305b a = C2305b.m6238a(activity);
        C2310g gVar = (C2310g) a;
        if (gVar.f6463b.f6461c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C2306c a2 = gVar.f6463b.mo5684a();
            if (C2310g.m6251b(2)) {
                Log.v("LoaderManager", "initLoader in " + a + ": args=null");
            }
            if (a2 == null) {
                try {
                    ((C2310g) a).f6463b.f6461c = true;
                    C41954b bVar = new C41954b(getActivity());
                    if (bVar.getClass().isMemberClass()) {
                        if (!Modifier.isStatic(bVar.getClass().getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVar);
                        }
                    }
                    C2306c cVar = new C2306c(bVar);
                    if (C2310g.m6251b(3)) {
                        Log.d("LoaderManager", "  Created new loader " + cVar);
                    }
                    ((C2310g) a).f6463b.f6460b.mo3730i(54321, cVar);
                    gVar.f6463b.f6461c = false;
                    cVar.mo5681o(gVar.f6462a, this);
                } catch (Throwable th) {
                    gVar.f6463b.f6461c = false;
                    throw th;
                }
            } else {
                if (C2310g.m6251b(3)) {
                    new StringBuilder("  Re-using existing loader ").append(a2);
                    Log.d("LoaderManager", "  Re-using existing loader ".concat(a2.toString()));
                }
                a2.mo5681o(gVar.f6462a, this);
            }
            ListView listView = (ListView) view.findViewById(R.id.license_list);
            listView.setAdapter(this.f109509a);
            listView.setOnItemClickListener(new C41955c(this));
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }
}
